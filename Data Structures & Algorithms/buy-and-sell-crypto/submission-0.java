class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1) return 0;
        int profit = 0;
        int start = prices[0];
        int calc;
        for (int i = 1; i < len; i++) {
            calc = prices[i] - start;
            if (calc > 0) {
                profit = Math.max(profit, calc);
            } else {
                start = prices[i];
            }
        }
        return profit;
    }
}
