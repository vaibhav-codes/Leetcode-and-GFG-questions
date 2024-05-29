class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int breakPoint=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>nums[i])
                {
                    breakPoint=i;
                    break;
                }
        }
        if(breakPoint==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int j=n-1;j>=breakPoint;j--){
            if(nums[j]>nums[breakPoint]){
                int temp=nums[j];
                nums[j]=nums[breakPoint];
                nums[breakPoint]=temp;
                break;           
            }
        }
        reverse(nums, breakPoint+1, n-1);
    }

    public static void reverse(int[] x,int a1, int a2) {
            
            
            for (int i = 0; i < (a2-a1+1)/2; i++) {
               swap(x,a1+i,a2-i);
            }
            
            //return x;
            
        }
    private static void swap(int[] x, int i, int j) {
//      System.out.println("values swappeed are "+ x[i] +  "  "  + x[j]);
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp; 
        
        
    }
}