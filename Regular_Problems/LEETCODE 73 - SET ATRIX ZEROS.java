class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[][] b =new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]==0){
                b[i][j]=true;
            }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<matrix[i].length;j++){
            if(b[i][j]){
                setzero(matrix,i,j,m,n);
            }
            }
        }
    }
        public void setzero(int[][] matrix,int i,int j,int m,int n){
            for(int x=0;x<m;x++){
                matrix[x][j]=0;
            }
            for(int y=0;y<n;y++){
                matrix[i][y]=0;
            }
        }
}