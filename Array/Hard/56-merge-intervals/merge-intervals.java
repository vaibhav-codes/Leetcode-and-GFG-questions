class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] sortedArray=sort2DArray(intervals);
        int n=intervals.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            //when ans list is empty or doesnt contain the specified interval
            if(ans.isEmpty()||intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            }
            //if the current interval lies between the last interval of answer
            else{
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
        }

        int[][] ansArray=convertTo2DArray(ans);
        return ansArray;
    }
    public static int[][] sort2DArray(int[][] arr) {
        // Sort the 2D array based on the first column, then the second column
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                // First, compare the first column
                int compareFirst = Integer.compare(row1[0], row2[0]);
                if (compareFirst != 0) {
                    return compareFirst;
                }
                // If first column is equal, compare the second column
                return Integer.compare(row1[1], row2[1]);
            }
        });
        
        return arr;
    }
      public static int[][] convertTo2DArray(ArrayList<ArrayList<Integer>> list) {
        int[][] array = new int[list.size()][];
        
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> row = list.get(i);
            array[i] = new int[row.size()];
            
            for (int j = 0; j < row.size(); j++) {
                array[i][j] = row.get(j);
            }
        }
        
        return array;
    }
    
}