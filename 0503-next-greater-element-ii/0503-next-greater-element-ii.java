class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int[] ans=new int[nums.length];
        int size=nums.length;
        for(int i =2 * size -1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<= nums[i%size]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%size]=-1;

            }
            else{
                ans[i%size] =nums[st.peek()];
            }
            st.push(i%size);
        }
        return ans;
        
    }
}