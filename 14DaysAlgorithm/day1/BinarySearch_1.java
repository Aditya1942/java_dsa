class Solution {
    public int search(int[] nums, int target) {
        int flag=-1;
        for(int i =0;i< nums.length;i++){
            
         if(nums[i]==target){
             flag = i;
             break;
             }
        }
        return flag;
     
    }
}
class BinarySearch_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
    }
}
// link : https://leetcode.com/problems/binary-search/