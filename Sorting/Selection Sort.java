
class Solution {
    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < nums.length; j++) {
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
