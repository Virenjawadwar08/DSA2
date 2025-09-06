import java.util.*;

public class leet41 {

// 41. First Missing Positive

// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.


    public int firstMissingPositive(int[] nums) {
       int i=0;
       while(i<nums.length) {
        int correct=nums[i]-1;
        if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]) {
            swap(nums,i,correct);
        }
        else {
            i++;
        }
       }

       for(int index=0;index<nums.length;index++) {
        if(nums[index]!=index+1) {
            return index+1;
        }
       }
       return nums.length+1;
    }

    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}


// Initial: [3, 4, -1, 1]
//  i=0 → nums[0]=3 → correct=2
//  nums[0]>0 && nums[0]<=4 && nums[0]!=nums[2] → swap(0,2)

// After swap: [-1, 4, 3, 1]
//  i=0 → nums[0]=-1 (not >0) → i++

//  i=1 → nums[1]=4 → correct=3
//  nums[1]!=nums[3] → swap(1,3)

// After swap: [-1, 1, 3, 4]
//  i=1 → nums[1]=1 → correct=0
//  nums[1]!=nums[0] → swap(1,0)

// After swap: [1, -1, 3, 4]
//  i=1 → nums[1]=-1 → i++

//  i=2 → nums[2]=3 → correct=2 → already in place → i++
//  i=3 → nums[3]=4 → correct=3 → already in place → i++

// Final rearranged array:
// [1, -1, 3, 4]


// Step 2: Find Missing Positive

// Now check index by index:

// index=0 → nums[0]=1 ✅

// index=1 → nums[1]=-1 ❌ (expected 2) → return 2

// ✅ Output:
// 2