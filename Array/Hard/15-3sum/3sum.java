class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> listSet= new HashSet<>();
        for(int i=0;i<n;i++){
            int j=i+1; int k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> tempList=List.of(nums[i],nums[j],nums[k]);
                    listSet.add(tempList);
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    int prev=nums[j];
                    while(j<k && prev==nums[j]) j++;
                }
                else{
                    int prev=nums[k];
                    while(j<k && prev==nums[k]) k--;
                }
            }
        }
        List<List<Integer>> ansList=new ArrayList<>();
        ansList.addAll(listSet);
        return ansList;
    }
}