class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>(); 
        for(int asteroid:asteroids){
            boolean destroyed = false;
            while(!st.isEmpty() && st.peek() > 0 && asteroid <0){
                int as=Math.abs(asteroid);

                if(as < st.peek() ){
                    destroyed = true;
                    break;
                }
                else if(as == st.peek()){
                    destroyed= true;
                    st.pop();
                    break;
                }
                else{
                    st.pop();
                }
            }
            if(!destroyed) {
                st.push(asteroid);
            }
        }
        int[] ans=new int[st.size()];
        for(int i =ans.length -1;i>=0;i--){
            ans[i]=st.pop();
        }
      
        return ans;
        
    }
}