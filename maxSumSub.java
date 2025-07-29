import java.util.*;

public class maxSumSub {

    // Method to compute the maximum subarray sum using Kadane's Algorithm
    public int kadane(int numbers[]) {
        int ms = Integer.MIN_VALUE; // ms = maximum sum found so far
        int cs = 0;                 // cs = current sum of the subarray
        boolean allNegative = true; // flag to check if all elements are negative
        int maxElement = numbers[0]; // to store the maximum single element (if all are negative)

        // Iterate through each number in the array
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i]; // add current element to current sum

            // If any non-negative element is found, set the flag to false
            if (numbers[i] >= 0) {
                allNegative = false;
            }

            // Keep track of the maximum single element
            maxElement = Math.max(maxElement, numbers[i]);

            // If current sum becomes negative, reset it to 0
            if (cs < 0) {
                cs = 0;
            }

            // Update maxSum if current sum is greater
            ms = Math.max(ms, cs);
        }

        // If all elements are negative, return the largest (least negative) element
        if (allNegative) {
            return maxElement;
        } else {
            return ms; // Otherwise return the maximum subarray sum
        }
    }

    // Main method to take input and invoke the Kadane method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();
        int numbers[] = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Create object of the class to call non-static method
        maxSumSub sol = new maxSumSub();

        // Print the result of Kadane's algorithm
        System.out.println(sol.kadane(numbers));
    }
}
