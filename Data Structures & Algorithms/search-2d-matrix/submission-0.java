class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target) return true;

            }
        }
        return false;
    }
}
