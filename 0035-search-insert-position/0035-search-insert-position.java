class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Found target
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        // If not found, left is the insert position
        return left;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 5)); // 2
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 2)); // 1
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 7)); // 4
    }
}
