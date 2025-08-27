class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n; // base cases

        int a = 1, b = 2; // dp[1] = 1, dp[2] = 2
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
