public class MoveZeroes {
    public static void swap(int[] arr,int a ,int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public  static void moveZeroes(int[] nums) {
        if(nums.length <=1)return;
        int n = nums.length-1;
        int i=0;
        int end=n;
        while (i < n) {
            if(nums[i]==0){
                System.out.println("i-"+i+" "+end);
                for (int j = i; j < end; j++) {
                    swap(nums,j,j+1);
                }
                end--;
            }else{
                i++;
            }
            if(i==end){break;}
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,0,0};
        moveZeroes(nums);
        System.out.println("");
        for (int i : nums) 
            System.out.print(i+" ");
    }
}


// link : https://leetcode.com/problems/move-zeroes/