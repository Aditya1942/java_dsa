import java.util.Collections;

public class RotateArray2 {
    public static void rotate_arr(int[] nums,int start ,int end) {
        int i  =start;
        int j = end;
        for (int k = start; k < end/2; k++) {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp; 
        }
        // while (i<=j) {
        //     int temp = nums[i];
        //     nums[i]=nums[j];
        //     nums[j]=temp; 
        //     i++;
        //     j--;
        // }
    }
    public static void rotate(int[] nums, int k) {
        if(nums.length == 1)return;
      k=k%nums.length;
    // rotate_arr(nums,nums.length-1-k+1,nums.length-1);
    // rotate_arr(nums,0,nums.length-1-k);
    rotate_arr(nums,0,nums.length-1);
}

    public static void main(String[] args) {
        int nums[] = {1,2,3}, k = 4;
        rotate(nums, k);
        for(int i : nums)
            System.out.print(i + " ");
    }
}
// link : https://leetcode.com/problems/rotate-array/









// public static void rotate(int[] nums, int k) {
//     if(nums.length == 1)return;
//     int arr[] = new int[nums.length*2];
//     System.arraycopy(nums, 0, arr, 0, nums.length);  
//     System.arraycopy(nums, 0, arr, nums.length, nums.length);  
//     int count = 0;
//     for (int i = k+1;i< nums.length + k+1; i++) {
//         nums[count] =arr[i];
//         count++;
//     }  
//     System.out.println(); 
// }



// public  static void rotate(int[] nums, int k) {
//     if(nums.length == 1)return;
//     for (int i = 0; i < k; i++) {
//         int swap = 0;
//         for (int j = 0; j < nums.length; j++) {
//             if(j==nums.length-1){
//                 nums[0]=nums[j];
//             }
//             int temp = nums[j];
//             nums[j]=swap;
//             swap=temp;
//         }
//     }
             
// }