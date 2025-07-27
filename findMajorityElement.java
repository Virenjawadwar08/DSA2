import java.util.*;

// Class to find the majority element using Moore's Voting Algorithm
class findMajorityElement {

    public int majorityElement(int nums[]) {
        int candidate = 0; // This will store our potential majority element
        int count = 0;     // Count of the candidate's occurrence

        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // If count drops to 0, we choose the current element as the new candidate
            if (count == 0) {
                candidate = num;
            }

            // If current number is same as candidate, increase count
            if (num == candidate) {
                count++;
            } else {
                // If not, decrease count
                count--;
            }
        }

        // After this loop, candidate holds the majority element
        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object of the class to call the non-static method
        findMajorityElement obj = new findMajorityElement();

        // Get the majority element
        int result = obj.majorityElement(nums);

        // Print the result
        System.out.println(result);
    }
}
