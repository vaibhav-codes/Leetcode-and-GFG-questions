class Solution {
    public int maxProfit(int[] prices) {
        int[] tempArr=new int[prices.length];
        tempArr[0]=Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<tempArr[i-1]){
                tempArr[i]=prices[i-1];
            }
            else{
                tempArr[i]=tempArr[i-1];
            }
        }
        int maxProfit=0, profit=0;
        for(int i=0;i<prices.length;i++){
            profit=prices[i]-tempArr[i];
            if(profit>maxProfit)
                maxProfit=profit;
        }

        return maxProfit;
    }
}