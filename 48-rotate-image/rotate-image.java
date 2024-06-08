class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int ansMatrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ansMatrix[i][j]=matrix[m-1-j][i];
            }
        }

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=ansMatrix[i][j];
            }
        }
    }
}