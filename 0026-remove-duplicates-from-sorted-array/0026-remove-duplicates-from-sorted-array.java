class Solution {
    public int removeDuplicates(int[] nums) {
    //    int k =1 ;
    //    for(int i = 1 ; i<nums.length ; i++){
    //         if(nums[i]!= nums[k-1]){
    //             nums[k]= nums[i];
    //             k++;
    //         }
    //    }
    //    return k;
            int n = nums.length;

            int i = 0, j=1;
            while(j<n){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                }

                j++;
            }


            return i+1;
    }
}