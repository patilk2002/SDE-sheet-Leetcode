class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        int m=matrix.length;
        int s=0;
        int e=m*n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[mid/n][mid%n]==target){
                return true;
            }
            if(matrix[mid/n][mid%n]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;

    }
}