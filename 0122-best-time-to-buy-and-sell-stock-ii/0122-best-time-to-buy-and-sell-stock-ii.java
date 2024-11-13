class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int minV = Integer.MIN_VALUE;
        int oProfit = 0;
        int sell = 0;
        boolean buyAgain = false;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>buy)
            {
                profit += prices[i]-buy;
                buy = prices[i];
            }
            else
            {
                buy = prices[i];
            }

            minV = Math.min(minV, prices[i]);
            oProfit += Math.max(oProfit, prices[i]-minV+oProfit);
        }
        return Math.max(profit, oProfit);
    }
}


