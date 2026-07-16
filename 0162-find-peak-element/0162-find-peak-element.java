class Solution {
    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // We are climbing uphill,
                // so a peak must be on the right.
                low = mid + 1;
            } else {
                // We are going downhill,
                // so a peak is on the left (including mid).
                high = mid;
            }
        }

        return low;
    }
}