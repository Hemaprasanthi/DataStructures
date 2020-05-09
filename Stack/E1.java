Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
    
class MinStack {
    Stack<int[]> st;
    int temp[];
    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        if (st.isEmpty()) {
            st.push(new int[]{x, x});
            return;
        }
        
        int currentMin = st.peek()[1];
        st.push(new int[]{x, Math.min(x, currentMin)});
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        int[] temp = st.peek();
        return temp[0];
    }
    
    public int getMin() {
        int[] temp = st.peek();
        return temp[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
