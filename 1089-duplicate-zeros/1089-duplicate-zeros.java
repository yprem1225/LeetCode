class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList <Integer> list = new ArrayList<>();

        for(int num : arr){
            list.add(num);
        }

        for(int i = 0 ; i<list.size() ; i++){
            if(list.get(i) == 0){
                list.add(i,0);
                i++;
            }
        }

        // Copy back only first arr.length elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
    }
}