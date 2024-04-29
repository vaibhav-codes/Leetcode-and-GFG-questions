import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        //Approach 1
        // HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        // int ans=Integer.MAX_VALUE;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i], map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //     }
        //     if(map.get(nums[i])>n/2)
        //     ans=nums[i];
        // }
        // return ans;
        int count=0, element=0, n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                element=nums[i];
                count++;
            }
            else if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }

        int counter2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==element)
            {
                counter2++;
            }
        }
        if(counter2>n/2) return element;
        else return -1;
    }
}