class Solution {
    public void rotate(int[][] matrix) {
        // int n=matrix.length;
        // int m=matrix[0].length;
        // int ansMatrix[][]=new int[n][m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         ansMatrix[i][j]=matrix[m-1-j][i];
        //     }
        // }

        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j]=ansMatrix[i][j];
        //     }
        // }


        //1st step transpose the matrix i.e col becomes row and row becomes column
        int n=matrix.length;
        int m=matrix[0].length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){

                if(i!=j){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                }
                
            }
        }

        //2nd step is to reverse all the rows of matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=temp;
            }
        }
    }
}