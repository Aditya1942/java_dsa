package day3;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int n = numbers.length-1;
        if(n+1==2){
            arr[0]=1;
            arr[1]=2;
        }
        for(int i =0;i<n;i++){
             if(i>=1&&numbers[i]==numbers[i-1]){
                    continue;
                }
            for(int j =i+1;j<=n;j++){
                 // System.out.println(numbers[i]+numbers[j]);
                if((numbers[i]+numbers[j])==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                    break;
                }
            }
            if( arr[0] !=0){
                break;
            }
        }
        return arr;
    }
}

// link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/