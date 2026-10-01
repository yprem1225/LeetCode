class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];

        int [] ans = new int[2*n];

        for(int i = 0 ; i<n ; i++){
            arr1[i] = nums[i]   ;
        }

        for(int i = n ; i<nums.length ; i++){
            arr2[i - n] = nums[i];
        }
        int idx = 0;
        for(int i = 0 ; i<nums.length ; i+=2){
            ans[i] = arr1[idx];
            idx++;
        }

        idx = 0;
        for(int i = 1 ; i<nums.length ; i+=2){
            ans[i] = arr2[idx];
            idx++;
        }
        

        return ans;
    }
}