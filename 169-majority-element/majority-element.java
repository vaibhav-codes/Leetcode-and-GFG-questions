import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
            if(map.get(nums[i])>n/2)
            ans=nums[i];
        }
        return ans;
    }
}