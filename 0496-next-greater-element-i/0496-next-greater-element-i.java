class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i =0; i<nums1.length ; i++){
            
             ans[i] = -1;  // default value

             // Find nums1[i] in nums2
             for(int j = 0 ; j<nums2.length ; j++){

                if(nums1[i] == nums2[j]){

                    // Find first greater element on the right
                    for(int k = j+1 ; k<nums2.length ; k++){
                        if(nums2[k] > nums1[i]){
                            ans[i] =  nums2[k];
                            break;
                        }
                    }
                    break; // nums1[i] is found, no need to search further
                }
             }
        }

        return ans;
        
    }
}