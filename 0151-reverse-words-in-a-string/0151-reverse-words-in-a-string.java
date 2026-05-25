class Solution {
    public String reverseWords(String s) {
        String[] st=s.trim().split("\\s+");
        StringBuilder ans= new StringBuilder();
        for(int i = st.length-1;i>=0;i--){
            ans.append(st[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
       return ans.toString();
    }
}