class Solution {
    public int[] nextGreaterElements(int[] arr) {
        
        

        // push all elements of arr in stack

        int n = arr.length;

        int[] nge = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for(int i = n-1 ; i>=0 ; i--){
            st.push(arr[i]);
        }

        // now apply the metgod of nge1 from gfg

        for(int i = n-1 ; i>=0 ; i--){
            while(st.size()>0 && arr[i] >= st.peek()){
                st.pop();
            }

            if(st.size() == 0){
                nge[i] = -1;
                st.push(arr[i]);
            }else{
                nge[i] = st.peek();
                st.push(arr[i]);
            }
        }

        return nge;
        
    }
}