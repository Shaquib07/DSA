class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        if(prices.length>=2){
            int buy=prices[0],sell=0;
            for(int day=1;day<prices.length;day++){
                sell=prices[day];
                if(sell<buy){
                    buy=prices[day];
                }else{
                    max_profit=Math.max(max_profit,sell-buy);
                }
            }
        }
        return max_profit;
    }
}