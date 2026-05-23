class Solution {
    public boolean exist(char[][] board, String word) {
        char[] ch =word.toCharArray();
        for(int i =0;i<board.length;i++){
            for(int j =0;j< board[0].length;j++){
                if(board[i][j] == ch[0]&& solve(i,j,board,0,ch))
                {
                    return true;
                    
                }
            }
        }
        return false;
        
    }
    public boolean solve(int i ,int j,char[][] board,int index,char[] ch){
        if(index==ch.length){
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=ch[index]||board[i][j]=='*'){
            return false;

        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean found=solve(i+1,j,board,index+1,ch)||
        solve(i-1,j,board,index+1,ch)||
        solve(i,j+1,board,index+1,ch)||
        solve(i,j-1,board,index+1,ch);
        board[i][j] =temp;
        return found;

    }
}