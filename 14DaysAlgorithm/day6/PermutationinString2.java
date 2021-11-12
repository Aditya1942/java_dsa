class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int l=0,r=s1.length()-1;
        HashMap<Character,Integer> m1  = new HashMap(); 
        HashMap<Character,Integer> m2  = new HashMap();  
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);  
            char c2 = s2.charAt(i);  
            m1.put(c,m1.getOrDefault(c,0)+1);
            m2.put(c2,m2.getOrDefault(c2,0)+1);
        }
        if(m1.equals(m2)){
            return true;
        }
        while(r<s2.length()-1){
            System.out.print(m1);
            System.out.println(m2);
            if(m1.equals(m2)){
                return true;
            }
            r++;
            char c1 = s2.charAt(l);
            char c2 = s2.charAt(r);
            if(m2.get(c1)==1){
                m2.remove(c1);
            }else{
                m2.put(c1,m2.getOrDefault(c1,0)-1);
            }
            m2.put(c2,m2.getOrDefault(c2,0)+1);
            l++;
            if(m1.equals(m2)){
            return true;
            }
        }
        return false;
    }
}

// link : https://leetcode.com/problems/permutation-in-string/