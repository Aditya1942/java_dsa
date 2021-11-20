class Solution {
    public int rob(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        // dp[i] means until i, max possible amount
        int[] dp = new int[nums.length + 1];

        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            // 2 cases: rob current house, not rob current
            dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length];
    }
}

// link : https://leetcode.com/problems/house-robber/