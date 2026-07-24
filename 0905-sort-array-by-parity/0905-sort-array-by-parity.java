class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int [] result = new int[nums.length];
        int count = 0;
        for(int i = 0 ; i<result.length ; i++){
            if(nums[i] % 2 == 0){
                result[count] = nums[i];
                count++;
            }
        }

        for(int i = 0 ; i<result.length ; i++){
            if(nums[i] % 2 != 0){
                result[count] = nums[i];
                count++;
            }
        }

        return result;
        
    }
}