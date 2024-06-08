class Solution {
    public void setZeroes(int[][] matrix) {
        //col[n]=matrix[0][...]
        //row[n]=matrix[...][0]
        
        int col0=1;
        int cols=matrix[0].length;
        int rows=matrix.length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //mark the i-th row
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    
                    //mark the j-th col
                    if(j!=0)
                        matrix[0][j]=0;
                    else
                        col0=0;
                }
                
            }
        }
       
       //fill the matrix except 0th row and 0th col
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[0][j]==0||matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        //fill the 0th row
        if(matrix[0][0]==0){
            for(int j=0;j<cols;j++)
                matrix[0][j]=0;
        }

        //fill the 0th col
        if(col0==0){
            for(int i=0;i<rows;i++)
                matrix[i][0]=0;
        }        
    }

}