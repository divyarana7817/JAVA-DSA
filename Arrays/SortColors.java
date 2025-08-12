package Arrays;

class Solution { // Time complexity for this O(N^2)    Space Complexity = O(N)
    public void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0, i = 0, right = n-1;
        while(i<=right){
            if(nums[i]==0){
                swap(nums,left++,i++);
            }else if(nums[i]==2){
                swap(nums,i,right--);
            }else{
                i++;
            }
        }
    }
}