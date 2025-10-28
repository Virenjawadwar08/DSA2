// 34. Find First and Last Position of Element in Sorted Array
public class leet34 {
    int []ans={-1,-1};
     public int[] searchRange(int[] nums,int target) {
    //check for first occurrence if target first
    int start=search(nums,target,true);
    int end=search(nums,target,false);

    ans[0]=start;
    ans[1]=end;

    return ans;
}
//this function returns the index value of what we are trying to search
    int search(int[] nums,int target,boolean findStartIndex) {

        int ans=-1;
        int start=0;
      int end=nums.length-1;

      while(start<=end) {
         int mid=start+(end-start)/2;

         if(target<nums[mid]) {
            end=mid-1;
         }
         else if(target>nums[mid]) {
            start=mid+1;
         }
         else {
            //potential ans found
            ans=mid;
            if(findStartIndex==true) {
                end=mid-1;
            } else {
                start=mid+1;
            }
         }
      }
      return ans;
    
    }
}
