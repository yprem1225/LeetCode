class Solution {
    public class Pair{
        int val;
        int idx;
        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int [] span = new int[n];
        span[n-1] = 0;

        Stack<Pair> st = new Stack<>();

        Pair p = new Pair(temperatures[n-1] , n-1);
        st.push(p);

        for(int i = n-2 ; i>=0 ; i--){
            while(st.size() > 0 && st.peek().val <=temperatures[i] ){
                st.pop();
            }

            if(st.size() == 0){
                span[i] = 0;
                st.push(new Pair(temperatures[i], i));
            }else{
                span[i] = st.peek().idx - i;
                st.push(new Pair(temperatures[i], i));
            }
        }

        return span;

        
    }
}