import java.util.*;

public class leet189 {

    // Rotate Array
    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
   public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;

        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
    }
    public void reverseNum(int nums[],int start,int end) {
        while(start<end) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}