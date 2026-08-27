class Solution {
    public boolean isValid(String s) {
        char [] ch = s.toCharArray();

        Stack<Character> ans = new Stack<>();

        for(char c : ch){
            if( c == '(' || c == '{' || c == '['){
                ans.push(c);
            }
            else if(c == ')' || c == '}' || c == ']'){

                if(ans.size() == 0) return false;

                char top = ans.peek();
                if( (c ==  ')'  && top == '(' ) ||
                    (c == '}'  && top == '{') ||
                    (c == ']'  && top == '[' )
                ){
                    ans.pop();
                }else{
                    return false;
                }
            }
        }

        return ans.empty();
        
    }
}