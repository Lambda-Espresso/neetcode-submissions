class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1) return 0;
        int profit = 0;
        int start = prices[0];
        for (int i = 1; i < len; i++) {
            if (start > prices[i]) {
                start = prices[i];
            } else if (profit < prices[i] - start) {
                profit = prices[i] - start;
            }
        }
        return profit;
    }
}
