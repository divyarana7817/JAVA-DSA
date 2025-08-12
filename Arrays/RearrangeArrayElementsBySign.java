package Arrays;


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int positidx = 0;
        int negatidx = 1;
        for(int i=0; i<n; i++){
            if(nums[i]<0){ //negative
               ans[negatidx] = nums[i];
               negatidx += 2;
            }else{ //positive
            ans[positidx] = nums[i];
             positidx +=2;
            }
        }
           return ans; 
    }
}