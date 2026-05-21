class Solution {
     public List<String> generateParenthesis(int n) {
        List<String> st=new ArrayList<>();
        solve(n , 0,0,st,"");
        return st;
    }
    public void solve(int n , int open, int close,List<String> st,String s){
        if(open == n && close ==n){
            st.add(s);
            return ;
        }
        if(open < n){
            solve(n,open+1 ,close,st,s+"(");
        }
        if(close< open){
            solve(n,open,close+1,st,s+")");
        }
        return ;
    }
     
}