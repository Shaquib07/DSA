class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        if(prices.length>=2){
            int buy=prices[0];
            for(int i=1;i<prices.length;i++){
                int sell=prices[i];
                if(buy>sell){
                    buy=sell;
                }
                else{
                    max_profit=max_profit+(sell-buy);
                    buy=prices[i];
                }
            }

        }
    return max_profit;
    }
}