class Solution {
    public int[] nextSmallerElements(int[] arr) {
        Stack< Integer> st = new Stack<>();

        int[] ans=new int[arr.length];

        for(int i =arr.length-1;i >=0;i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i] ){
                st.pop();
            }
            ans[i] = st.isEmpty() ? arr.length :st.peek();
            st.push(i);
        }
        return ans;
    }
    public int[] previousSmallerElements(int[] arr) {
        Stack< Integer> st = new Stack<>();

        int[] ans=new int[arr.length];

        for(int i =0;i < arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i] ){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 :st.peek();
            st.push(i);
        }
        return ans;
    }
    

    public int sumSubarrayMins(int[] arr) {
        int[] nse=nextSmallerElements(arr);
        int[] pse=previousSmallerElements(arr);
        long total=0;
        int mod=(int)(1e9 +7);
        for(int i =0;i< arr.length;i++){
            int ns=nse[i]-i;
            int ps=i-pse[i];
            total= (total+(ns*ps *1L % mod *arr[i])%mod)%mod;

        }
        return (int) total;
     }
}