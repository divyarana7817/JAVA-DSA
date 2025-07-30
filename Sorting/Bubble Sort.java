
class Solution {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;

        for (int i = n - 1; i >= 0; i--) {
            int swap = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = 1;
                }
            }

            // No swaps = already sorted
            if (swap == 0) break;
        }

        return nums;
    }
}
