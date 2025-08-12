package Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int res = nums[0];
        int count = 1;
        for(int i=0; i<n; i++){
            int num = nums[i];
            if(res==num)++count;
            else --count;
            if(count==0){
            res= num;
            count=1;
        }}
        return res;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)