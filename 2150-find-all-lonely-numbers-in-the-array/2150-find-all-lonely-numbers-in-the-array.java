class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        // Check lonely condition
        for (int num : nums) {

            if (map.get(num) == 1 &&
                !map.containsKey(num - 1) &&
                !map.containsKey(num + 1)) {

                ans.add(num);
            }
        }

        return ans;
        
    }
}