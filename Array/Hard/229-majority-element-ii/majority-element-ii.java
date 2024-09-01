class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ansList=new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int si=i+n/3;
            if(si<n&&nums[i]==nums[si]){
                if(ansList.size()!=0&&ansList.get(ansList.size()-1)!=nums[i])
                {
                    ansList.add(nums[i]);   
                }
                else if(ansList.size()==0){
                    ansList.add(nums[i]);
                }
                i=si;
            }
        }
        return ansList;
    }
}