class NQueen{
    public static void main(String[] args) {
        // Queens();
        int n=4;
        boolean[][] board= new boolean[n][n];
        System.out.print(Queen(board,0));
    }

    public static int Queen(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            return 1;
        }
        int count=0;

        for(int col=0;col<board.length;col++){
        if(isSafe(board,row,col)){
            board[row][col]=true;
            count+=Queen(board,row+1);
            board[row][col]=false;

        }
        
    }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i=0;i<row;i++){
            if(board[i][col]) return false;
        }

        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]) return false;
        }

        int maxright=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]) return false;
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean ele:row){
                if(ele) System.out.print("Q");
                else System.out.print("x");
            }
            System.out.println();
        }
        System.out.println();
    }
}