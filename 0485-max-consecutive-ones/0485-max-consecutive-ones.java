class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCon = 0;
        int consecutive= 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] ==  1){
                consecutive++;

                maxCon = Math.max(maxCon , consecutive);
            }else{
                consecutive = 0;
            }
        }

        return maxCon;
        
    }
}
