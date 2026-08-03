class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(list.contains(num)){
                continue;
            }
            list.add(num);
        }
        if (list.size() < 3) {
            return list.get(list.size() - 1); // largest
        }

        
         return list.get(list.size() - 3); // third largest
    }
}