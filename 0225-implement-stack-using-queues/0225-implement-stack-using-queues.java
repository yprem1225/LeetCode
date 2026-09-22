class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int size = q.size();

        for(int i = 0 ; i< size-1 ; i++){
            q.add(q.remove());
        }
        int popedElement = q.peek();
        q.remove();
        return popedElement;
    }
    
    public int top() {
        for(int i = 0 ; i<q.size()-1 ; i++){
            q.add(q.remove());
        }
        int topElement = q.peek();

        q.add(q.remove());
        

        return topElement;
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */