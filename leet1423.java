public class leet1423 {
    public int maxScore(int[] cardPoints, int k) 
    {
        int n = cardPoints.length;

        // Step 1: Calculate total sum
        int totalSum = 0;
        for (int i = 0; i < n; i++) 
        {
            totalSum += cardPoints[i];
        }

        // Step 2: If taking all cards
        if (k == n) 
        {
            return totalSum;
        }

        // Step 3: Sliding window of size (n - k)
        int windowSize = n - k;

        int windowSum = 0;

        // First window
        for (int i = 0; i < windowSize; i++) 
        {
            windowSum += cardPoints[i];
        }

        int minSum = windowSum;

        // Slide the window
        for (int i = windowSize; i < n; i++) 
        {
            windowSum = windowSum + cardPoints[i] - cardPoints[i - windowSize];

            if (windowSum < minSum) 
            {
                minSum = windowSum;
            }
        }

        // Step 4: Result
        return totalSum - minSum;
    }
}
