public class ReverseWords2 {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int starting = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ' ' || i == sb.length()-1){
                int ending = sb.charAt(i)==' '?i-1:i;
                int count =ending;
            // for (int j = starting; j <= ending; j++) {
                for (int j = starting; j <= (ending+starting)/2; j++) {
                if(j==count)break;
                // System.out.println(sb.charAt(j));
                // System.out.println("Starting = "+ j +" | Ending = "+ (count));
                // System.out.println("Starting = "+ sb.charAt(j) +" | Ending = "+ sb.charAt(count));
                int front = j;
                int back =count            ;
                
                char frontChar = sb.charAt(front);
                char backChar = sb.charAt(back);
                // System.out.println("frontChar = "+front +" |  = "+ frontChar);
                // System.out.println("backChar = "+back +" |  = "+ backChar);
                sb.setCharAt(front, backChar);
                sb.setCharAt(back, frontChar);
                count--;
                }
                starting=i+1;
                // System.out.println();
            }
    
         }
         return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Let's take";
        reverseWords(s);
        // System.out.println(s);

    }
}

// link : https://leetcode.com/problems/reverse-words-in-a-string-iii/\


