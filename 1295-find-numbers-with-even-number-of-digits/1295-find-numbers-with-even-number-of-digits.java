class Solution {
    //approach 1
    // public static boolean numberHasEvenDigits(int num){
    //     int count = 0;

    //     while(num!= 0){
    //         num = num/10;
    //         count++;
    //     }

    //     return count % 2 == 0;
    // }
    // public int findNumbers(int[] nums) {
    //     int evenCount = 0;

    //     for(int i = 0 ; i<nums.length ; i++){
    //         if(numberHasEvenDigits(nums[i])){
    //             evenCount++;
    //         }
    //     }

    //     return evenCount;
        
    // }

    public int findNumbers(int[] nums) {
       int evenCount = 0;

       for(int num : nums){
            int len = String.valueOf(num).length();

            if(len % 2 == 0) evenCount++;
       }

       return evenCount;
        
    }
}