
class Solution {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n - 2; i++) {
            int small = i;
            for (int j = i + 1; j <= n-1; j++) {
                if (nums[small] > nums[j]) {
                    small = j;
                }
            }
            int temp = nums[small];
            nums[small] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
