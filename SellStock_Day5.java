package practice.leetcode30days;

public class SellStock_Day5 {
	public static void main(String[] args) {
		SellStock_Day5 ss = new SellStock_Day5();
		int [] prices = {0,5,5,6,2,1,1,3};
		System.out.println(ss.maxProfit(prices));
	}
	
	public int maxProfit(int[] prices) {
	    int profit = 0;
	    for(int i=1; i<prices.length; i++){
	        int diff = prices[i]-prices[i-1];
	        if(diff > 0){
	            profit += diff;
	        }
	    }
	    return profit;
	}

}
