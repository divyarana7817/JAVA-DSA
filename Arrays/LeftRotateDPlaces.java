package Arrays;
class Solution { 
    public void reverse(int[] nums, int st, int end){
        while(st < end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }

    public void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // Step 1: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 2: Reverse remaining elements
        reverse(nums, k, n - 1);
        // Step 3: Reverse the entire array
        reverse(nums, 0, n - 1);
    }
}
