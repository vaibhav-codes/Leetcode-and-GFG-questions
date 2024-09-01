class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }

             int first = nums[i];

             for(int j=i+1; j<n; j++){
                if(j != i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int second = nums[j];

                long sum = (long)target - ((long)first + (long)second);

                int start = j+1;
                int end = n-1;

                while(start < end){
                    int tempSum = nums[start] + nums[end];

                    if(tempSum == sum){
                        List<Integer> tempResult = new ArrayList<>();
                        tempResult.add(first);
                        tempResult.add(second);
                        tempResult.add(nums[start]);
                        tempResult.add(nums[end]);

                        result.add(tempResult);

                        while(--end > start && nums[end] == nums[end + 1]);
                        while(++start < end && nums[start] == nums[start - 1]);
                    }else if(tempSum > sum){
                            end--;
                    }else{
                            start++;
                    }
                }
             }
        }

        return result;
    }
}