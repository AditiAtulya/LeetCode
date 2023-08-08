class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size1=matrix.length,size2=matrix[0].length;
        for(int i=0,j=0;;i++){
            if(i==size1){
                i=0;
                ++j;
            }
            if(j==size2){
                break;
            }
            if(matrix[i][j]==target){
                return true;
            }
        }
        return false;
    }
}
