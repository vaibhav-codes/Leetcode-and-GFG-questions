class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        int n=nums.length;
        if(n==0||n==1){
            return n;
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        int count=0; int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            count=1;
            if(!set.contains(nums[i]-1)){
                int nextNumber=nums[i]+1;
                while(set.contains(nextNumber)){
                    count++;
                    nextNumber++;
                }
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}