class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(0,board,ans);
        return ans;
        
    }
    public void solve(int row , char[][] board,List<List<String>>ans){
        if(row==board.length){
            List<String> temp=new ArrayList<>();
            for(int i =0;i< board.length;i++){
                temp.add(new String(board[i]));

            }
            ans.add(temp);
        }
        for(int col =0;col<board.length;col++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                solve(row+1,board,ans);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(int row,int col,char[][] board){
        //right
        int maxright=Math.min(row,board.length-1-col);
        for(int i =1;i<=maxright;i++){
            if(board[row-i][col+i]=='Q'){
                return false;
            }
        }
        //left
         int maxleft=Math.min(row,col);
        for(int i =1;i<=maxleft;i++){
            if(board[row-i][col-i]=='Q'){
                return false;
            }
        }
        //vertical
        
        for(int i =0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        return true;
    }
}