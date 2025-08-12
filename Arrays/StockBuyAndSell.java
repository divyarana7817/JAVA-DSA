package Arrays;

class Solution {
    public int maxProfit(int[] prices) { // O(N), O(1)
    int n = prices.length;
        int maxProfit = 0;
        int min = prices[0];
        for(int i = 1; i<n; i++){
            min = Math.min(min,prices[i]);
            int profit = prices[i]-min;
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}