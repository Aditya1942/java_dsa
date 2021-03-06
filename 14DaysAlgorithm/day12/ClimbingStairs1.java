class Solution {
    public int climbStairs(int n) {

        if (n <= 0) {
            return 0;
        }

        // dp[i], ways to i
        int[] dp = new int[n + 1];

        dp[0] = 1; // to make dp[2] correct when adding up
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

// link : https://leetcode.com/problems/climbing-stairs/