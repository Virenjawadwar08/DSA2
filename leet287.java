import java.util.*;

public class leet287 {

    // 287. Find the Duplicate Number
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length) {
            if(nums[i]!=i+1) {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]) {
                swap(nums,i,correct);
            } else {
                return nums[i];
            }
        } else {
            i++;
        }

    }
    return -1;
    }

    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

// Input:

// nums = {3,1,3,4,2}


// Step-by-step:

// i=0 → nums[0]=3 should go to index 2. Swap → {3,1,3,4,2} becomes {3,1,3,4,2} (after swap still same since duplicate).
// Here nums[0] == nums[2], so return 3.

