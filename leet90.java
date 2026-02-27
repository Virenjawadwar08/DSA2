import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class leet90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);  // Step 1: Sort
        
        backtrack(result, new ArrayList<>(), nums, 0);
        
        return result;
    }
    
    private void backtrack(List<List<Integer>> result,
                           List<Integer> current,
                           int[] nums,
                           int index) {
        
        // Add current subset
        result.add(new ArrayList<>(current));
        
        for (int i = index; i < nums.length; i++) {
            
            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            
            current.add(nums[i]);
            
            backtrack(result, current, nums, i + 1);
            
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
