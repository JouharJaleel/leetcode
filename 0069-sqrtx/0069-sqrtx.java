class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // sqrt(0)=0, sqrt(1)=1

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // use long to avoid overflow in mid*mid
            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;  // exact sqrt found
            } else if (sq < x) {
                ans = mid;   // store candidate
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
