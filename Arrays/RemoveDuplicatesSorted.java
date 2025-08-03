package Arrays;

class Solution { // optimal T.C = O(N), S.C = O(1)
    public int removeDuplicates(int[] nums) {
          int n = nums.length;
          int i = 0;
        for(int j=1; j<n; j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }

        }
        return i+1;
    }
}