import java.util.*;

class singleNumber {

    // Function to find the element that appears only once using XOR
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i]; // XOR cancels out duplicate elements
        }

        return result;
    }

    // Main method to take input and call the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size of the array as input
       
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Taking array elements as input
      
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Creating object of Solution class and calling the method
        singleNumber sol = new singleNumber();
        int result = sol.singleNumber(nums);

        // Printing the result
        System.out.println(result);
    }
}

