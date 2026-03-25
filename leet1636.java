import java.util.Arrays;
import java.util.HashMap;

public class leet1636 {
    public int[] frequencySort(int[] nums) {
        // Step 1: count frequency

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums) {
        map.put(num,map.getOrDefault(num, 0)+1);
        }

         // Step 2: convert to Integer[]
         Integer[] temp=new Integer[nums.length];
         for(int i=0;i<nums.length;i++) {
            temp[i]=nums[i];
         }

         // Step 3: sort
         Arrays.sort(temp,(a,b)-> {
            if(!map.get(a).equals(map.get(b))) {
                return map.get(a)-map.get(b);// lower freq first
            } else {
                return b-a;//higher value first
            }
         });

         // Step 4: convert back
         int[] result=new int[nums.length];
         for(int i=0;i<nums.length;i++) {
            result[i]=temp[i];
         }

         return result;
        }
}
