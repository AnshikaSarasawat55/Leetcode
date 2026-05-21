class Solution {
     public List<String> generateParenthesis(int n) {
    //     List<String> st=new ArrayList<>();
    //     solve(n , 0,0,st,"");
    //     return st;
    // }
    // public void solve(int n , int open, int close,List<String> st,String s){
    //     if(open == n && close ==n){
    //         st.add(s);
    //         return ;
    //     }
    //     if(open < n){
    //         solve(n,open+1 ,close,st,s+"(");
    //     }
    //     if(close< open){
    //         solve(n,open,close+1,st,s+")");
    //     }
    //     return ;
    // }
         List<String> ans = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        solve(n, 0, 0, sb, ans);

        return ans;
    }

    public void solve(int n, int open, int close,
                      StringBuilder sb,
                      List<String> ans) {

        // base case
        if (open == n && close == n) {
            ans.add(sb.toString());
            return;
        }

        // add (
        if (open < n) {

            sb.append('(');

            solve(n, open + 1, close, sb, ans);

            sb.deleteCharAt(sb.length() - 1); // backtrack
        }

        // add )
        if (close < open) {

            sb.append(')');

            solve(n, open, close + 1, sb, ans);

            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }
}