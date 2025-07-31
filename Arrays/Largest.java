
package Arrays;
import java.util.Arrays; //  This line is required

class Solution {
    public int largestElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n - 1];
    }
}
