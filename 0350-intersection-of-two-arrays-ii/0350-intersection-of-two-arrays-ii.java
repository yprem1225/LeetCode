class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         int i = 0;
        int j = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i< nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }else if( nums1[i]< nums2[j]){
                i++;
            }else if( nums2[j] < nums1[i]){
                j++;
            }
        }

        int [] ans = new int[arr.size()];
        int k = 0;

        for(int num : arr){
            ans[k]= num;
            k++;
        }

        return ans;
        
    }
}