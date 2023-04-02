class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean ans=true;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c=board[i][j];
                    board[i][j]='.';
                    ans=checkValid(board,c,i,j);
                    board[i][j]=c;
                }
                if(!ans) return ans;

            }
        }
     return true;
    }
    
    public boolean checkValid(char[][] board,char c,int i,int j){
        for(int p=0;p<9;p++){
            if(board[p][j]==c) return false;
            if(board[i][p]==c) return false;
            if(board[3*(i/3)+p/3][3*(j/3)+p%3]==c) return false;
        }
        return true;
    }
}