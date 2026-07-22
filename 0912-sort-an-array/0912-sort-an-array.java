class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
        
    }

    public static void mergeSort(int [] arr){
        int n = arr.length;

        if(n == 1) return;

        //step1: create two new empty arrays
        int [] a = new int[n/2];
        int [] b = new int[n-n/2];

        // step 2 : copy paste array into a & b
        int indx = 0 ;

        for(int i = 0 ; i<a.length ; i++){
            a[i] = arr[indx];
            indx++;
        }
        for(int i = 0 ; i<b.length; i++){
            b[i] = arr[indx];
            indx++;
        }

        // step3 :- magic
        mergeSort(a);
        mergeSort(b);

        //step 4:-Merger a and b into arr
        merge(a,b,arr);
    }

    public static void merge(int[] a, int[] b, int[] c){
        int i = 0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                k++;
                i++;
            }else{
                c[k] = b[j];
                k++;
                j++;
            }
        }

        while(i < a.length){
            c[k] = a[i];
            k++;
            i++;
        }

        while(j < b.length){
            c[k] = b[j];
            k++;
            j++;
        }
    }
}