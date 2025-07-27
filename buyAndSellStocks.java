import java.util.*;

class buyAndSellStocks {

    // Method to calculate the maximum profit from buying and selling stocks
    public int maxProfit(int[] prices) {
        // Initialize buyPrice to a very large value so that any price will be lower initially
        int buyPrice = Integer.MAX_VALUE;
        
        // Variable to keep track of the maximum profit
        int maxp = 0;

        // Iterate through the array of prices
        for (int i = 0; i < prices.length; i++) {
            // If current price is greater than the buyPrice, a profit can be made
            if (buyPrice < prices[i]) {
                // Calculate the profit for this transaction
                int profit = prices[i] - buyPrice;

                // Update maxp if this profit is greater than previous maxp
                maxp = Math.max(maxp, profit);
            } else {
                // If current price is less than or equal to buyPrice,
                // update buyPrice to this new lower price
                buyPrice = prices[i];
            }
        }

        // Return the maximum profit found
        return maxp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of days (size of the prices array)
        int n = sc.nextInt();

        // Initialize the prices array
        int[] prices = new int[n];

        // Take input of prices for each day
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Create an object of the class to call the non-static method
        buyAndSellStocks sol = new buyAndSellStocks();

        // Print the result returned by maxProfit method
        System.out.println(sol.maxProfit(prices));
    }
}
