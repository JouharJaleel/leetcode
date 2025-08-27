class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int totalLeft = (m + n + 1) / 2; // left partition size

        int left = 0, right = m;

        while (left <= right) {
            int i = (left + right) / 2; // partition index in nums1
            int j = totalLeft - i;      // partition index in nums2

            int nums1Left = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1Right = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int nums2Left = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2Right = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Check if partition is correct
            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                // Found correct partition
                if ((m + n) % 2 == 0) {
                    // Even total length → average of two middle values
                    return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
                } else {
                    // Odd total length → max of left side
                    return Math.max(nums1Left, nums2Left);
                }
            } else if (nums1Left > nums2Right) {
                // nums1 partition too far right → move left
                right = i - 1;
            } else {
                // nums1 partition too far left → move right
                left = i + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays not sorted");
    }
}
