class Solution {
    public int maxSubArray(int[] nums) {
        // Brute Force
        
        // int n = nums.length;
        // int max = nums[0];

        // for(int i = 0; i<n ; i++){
        //     int currentSum = 0;
        //     for(int j = i; j<n ; j++){
        //         currentSum = currentSum + nums[j];
        //         if(currentSum > max ){
        //             max = currentSum;
        //         }
        //     }
        // }

        // return max;
          int currentSum = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < nums.length; i++) {

        currentSum = Math.max(nums[i], currentSum + nums[i]);

        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
    }
}