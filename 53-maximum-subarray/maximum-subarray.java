class Solution {
    public int maxSubArray(int[] nums) {
    //    int maxi = Integer.MIN_VALUE; // maximum sum
    //     int n=nums.length;
    //     for (int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for (int j = i; j < n; j++) {
    //             // current subarray = arr[i.....j]

    //             //add the current element arr[j]
    //             // to the sum i.e. sum of arr[i...j-1]
    //             sum += nums[j];

    //             maxi = Math.max(maxi, sum); // getting the maximum
    //         }
    //     }
    //     return maxi;
    int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;
        int n =nums.length;
        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
}