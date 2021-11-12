package day1;

class Solution {
    public int searchInsert(int[] nums, int target) {
      int flag =0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                flag=i;
                break;
            }else if (nums[i]>target){
                flag = i;
                break;
            }else{
                flag = nums.length;
            }
        }
        return flag;
    }
}

// lint : https://leetcode.com/problems/search-insert-position/