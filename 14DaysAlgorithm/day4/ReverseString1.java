public class ReverseString1 {
    public  static void reverseString(char[] s) {
        int i = 0,j=s.length-1;
        while (i<j) {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        
    }
    public static void main(String[] args) {
        char arr[] = {'h','e','l','l','o'};
        reverseString(arr);
        for (char i : arr) {
            System.out.print(i + " ");
            
        }
    }
    
}


// link : https://leetcode.com/problems/reverse-string/