public class leet1248 {
     public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }

    private int helper(int[] nums,int k) {
        int count=0,ans=0;
        int start=0;

        for(int end=0;end<nums.length;end++) {
            if(nums[end]%2!=0) count++;

            while(start<nums.length && count>k) {
                if(nums[start]%2!=0) count--;
                start++;
            }
            ans+=(end-start+1);
        }
        return ans;
    }
}
