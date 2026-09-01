class Solution {
    public boolean backspaceCompare(String s, String t) {

        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();
       
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i = 0 ; i<arr1.length; i++){
            if (arr1[i] == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            }else{
                st1.push(arr1[i]);
            }
        }

        for(int i = 0 ; i<arr2.length; i++){
            if (arr2[i] == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            }else{
                st2.push(arr2[i]);
            }
        }

        //approach 1 to check characters in stack
        return st1.equals(st2);







        
    }
}