import java.util.*;

public class leet442 {

    // 442. Find All Duplicates in an Array
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

   public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]) {
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }

        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++) {
            if(nums[index]!=index+1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}