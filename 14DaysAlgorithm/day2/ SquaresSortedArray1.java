import java.util.*;

class  SquaresSortedArray1 {
       public static int[] sortedSquares(int[] nums) {
         for (int i = 0;i < nums.length;i++) {
            nums[i] *= nums[i];
        }
        for (int i = 0;i < nums.length;i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length-i-1; j++) {
             if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1]=temp;
                  swapped = true;
             }
            }
            if(!swapped){
                break;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        int[] result = sortedSquares(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    
    }
}




// link : https://leetcode.com/problems/squares-of-a-sorted-array/





// class Solution {
//     public int[] sortedSquares(int[] nums) {
//          for (int i = 0;i < nums.length;i++) {
//             nums[i] *= nums[i];
//         }
//         for (int i = 0;i < nums.length;i++) {
//             boolean swapped = false;
//             for (int j = 0; j < nums.length-i-1; j++) {
//              if(nums[j]>nums[j+1]){
//                 int temp = nums[j];
//                 nums[j] = nums[j+1];
//                 nums[j+1]=temp;
//                   swapped = true;
//              }
//             }
//             if(!swapped){
//                 break;
//             }
//         }
//         return nums;
//     }
// }