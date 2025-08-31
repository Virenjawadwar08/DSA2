import java.util.*;

public class leet485 {
    //  Max Consecutive Ones

    // Given a binary array nums, return the maximum number of consecutive 1's in the array.
   public int findMaxConsecutiveOnes(int[] nums) {
        int curr_count=0;
        int maxCount=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                curr_count++;
                maxCount=Math.max(maxCount,curr_count);
            }
            else {
                curr_count=0;
            }
        }
        return maxCount;
    }
} 