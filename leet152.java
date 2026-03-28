public class leet152 {
    public int maxProduct(int[] nums) 
    {
        int max = Integer.MIN_VALUE ;
        int temp = 1 ;
        int n = nums.length ;
        for(int i = 0;i<n;i++)
        {
            temp *= nums[i] ;
            max = Math.max(max,temp) ;
            if(nums[i] == 0) temp = 1;
        }
        temp = 1 ;
        for(int i =n-1;i>=0;i--)
        {
            temp*=nums[i] ;
            max = Math.max(max,temp) ;
            if(nums[i] == 0) temp =1 ;
        }
        return max ;

    }
}
