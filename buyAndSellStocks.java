import java.util.*;

class buyAndSellStocks {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxp=0;

        for(int i=0;i<prices.length;i++) {
            if(buyPrice<prices[i]) {
                int profit=prices[i]-buyPrice;

                maxp=Math.max(maxp, profit);
            } else {
                buyPrice=prices[i];
            }
        }
        return maxp;
    }
    


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[] prices=new int[n];

    for(int i=0;i<n;i++) {
        prices[i]=sc.nextInt();
    }

    buyAndSellStocks sol=new buyAndSellStocks();
    System.out.println(sol.maxProfit(prices));
    
}
}