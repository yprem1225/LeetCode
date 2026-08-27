class Solution {
    public String removeDuplicates(String s) {
        char [] ch = s.toCharArray();

        Stack<Character> ans = new Stack<>();

        for(char ele : ch){
            if(!ans.isEmpty() && ans.peek() == ele){
                ans.pop();
            }else{
                ans.push(ele);
            }
        }

        StringBuilder s1 = new StringBuilder();

        while(!ans.isEmpty()){
            s1.append(ans.pop());
        }
        
        return s1.reverse().toString();
        
    }
}