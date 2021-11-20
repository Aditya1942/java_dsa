class Solution {
    public int singleNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a ^= nums[i];
        }

        return a;
    }

}

// link : https://leetcode.com/problems/single-number/