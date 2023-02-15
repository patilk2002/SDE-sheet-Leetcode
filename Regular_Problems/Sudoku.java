class Sudoku{
    public static void main(String[] args) {
        char[][] board ={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};    

        if(board == null || board.length < 9) return;
        
        solve(board);
        display(board);

    }
 
 
    // static boolean solve(char[][] board ){

    //     int n=board.length;
    //     int row = -1;
    //     int col = -1;

    //     boolean emptyleft=true;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(board[i][j]=='.'){
    //                 row=i;
    //                 col=j;
    //                 emptyleft=false;
    //                 break;
    //             }
    //         }

    //         if(emptyleft == false){
    //             break;
    //         }
    //     }
    //     if(emptyleft==true){
    //         return true;
    //     }

    //     // backtrack

    //     for(int number=1;number<=9;number++){
    //         if(isSafe(board,row,col,number)){
    //             board[row][col]=(char)(number+'0');
    //             // System.out.print((char)number);

    //             if(solve(board)){
    //                 return true;
    //             }
    //             else{
    //                 board[row][col]='.';
    //             }
    //         }
    //     }

    //     return false;
    // }

    // public static boolean isSafe(char [][] board,int row,int col,int num){
    //     for(int i=0;i<board.length;i++){
    //         if(board[row][i]==(char)(num+'0')){
    //             return false;
    //         }
    //     }

    //     for(int i=0;i<board.length;i++){
    //         if(board[i][col]==(char)(num+'0')){
    //             return false;
    //         }
    //     }


    //     int sqrt=(int)(board.length);
    //     int rowstart=row-row%sqrt;
    //     int colstart=col-col%sqrt;

    //     for(int r=rowstart;r<rowstart+sqrt;r++){
    //         for(int c=colstart;c<colstart;c++){
    //             if(board[r][c]==(char)(num+'0')){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }


    public static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        //this is how we are replacing r,c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row, then break
            if (emptyLeft == false) {
                break;
            }
        }
        if (emptyLeft == true) {
            return true;
            //sudoku is solved

        }
        //backtrack
        for (char number = '1'; number <= '9'; number++) {
           
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {

                    return true;
                    //found the answer

                } else {
                    //backtrack
                    board[row][col] = '.';
                }
            }
        }
        return false;

    }
    public static boolean isSafe(char[][] board,int row,int col,char c){
        //checking the row
        for(int i=0;i<board.length;i++){
            //checking if the number is in the row

        if(board[row][i]==c){
            return false;
        }
            }
        //cols
        for(char[] nums: board){
            if(nums[col]==c){
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int start=row-row%sqrt;
        int cstart=col-col%sqrt;
        for(int r=start;r<start+sqrt;r++){
            for (int co = cstart; co < cstart + sqrt; co++) {
                if (board[r][co] == c) {
                    return false;
                }
        }
    }
        return true;
}

    public static void display(char[][] board){
        for(char[] row:board){
            for(char i:row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}