class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ansList=new ArrayList<Integer>();

        int count=0;
        int left=0; 
        int top=0;
        int right=matrix[0].length;
        int bottom=matrix.length;
        int totalCount=right*bottom;
        right=right-1;
        bottom=bottom-1;
        
        while(left<=right&&top<=bottom){
           for(int i=left;i<=right&&count<totalCount;i++){
                ansList.add(matrix[top][i]);
                count++;
            }
            top++;
            for(int j=top;j<=bottom&&count<totalCount;j++){
                ansList.add(matrix[j][right]);
                count++;
            }
            right--;
            for(int k=right;k>=left&&count<totalCount;k--){
                ansList.add(matrix[bottom][k]);
                count++;
            }
            bottom--;
            for(int l=bottom;l>=top&&count<totalCount;l--){
                ansList.add(matrix[l][left]);
                count++;
            }
            left++;
        }
        return ansList;
    }
}