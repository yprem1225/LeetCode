class Solution {
    public String countAndSay(int n) {
        String s ="1";

        for(int k = 2 ; k<=n ; k++){

            String ans = "";

            int i = 0, j = 0;

            while(j<s.length()){
                if(s.charAt(i) == s.charAt(j)){
                    j++;
                }else{
                    int freq = j-i;
                    ans+=freq;
                    ans+=s.charAt(i);
                    i=j;
                }
            }

            int freq = j-i;
            ans+=freq;
            ans+=s.charAt(i);

            s = ans; // Next string becomes current string
        }
        

        return s;
    }

  
}