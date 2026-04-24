class MinStack {
     Stack<Long> s;
     long min;

    public MinStack() {
        s=new Stack<>();
        
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            min = val;
            s.push((long)val);
        }
        else{
            if(val< min){
                s.push( 2L*val - min);
                min = val;
            }else{
                s.push((long)val);
            }
        }
        
    }
    
    public void pop() {
        if(s.peek() < min ){//
            min= 2 * min -s.peek();
        }
        s.pop();
        return ;
        
    }
    
    public int top() {
        long t= s.peek();
        if(t< min)
        {
            return (int)min;

        }else{
          
       
         return(int)t ;
        }
        
    }
    
    public int getMin() {
        return (int) min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */