class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // int [] arr = new int[m+n];

        // for(int i = 0;i<m ; i++){
        //     arr[i]= nums1[i];
        // }
        // int index = 0;
        // for(int i = m ; i<m+n ; i++){
            
        //     arr[i]= nums2[index];
        //     index++;
        // }

        // Arrays.sort(arr);
        
        // for(int i = 0; i < m + n; i++){
        //     nums1[i] = arr[i];
        // }

        // Using three pointers

        int i = 0,j=0,k=0;
        int [] c = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                c[k] = nums1[i];
                k++;
                i++;
            }else{
                c[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i < m){
            c[k] = nums1[i];
            k++;
            i++;
        }

        while(j < n){
            c[k] = nums2[j];
            k++;
            j++;
        }

         // Copy merged array back to nums1
        for(int x = 0; x < m + n; x++){
            nums1[x] = c[x];
        }
        
    }
}