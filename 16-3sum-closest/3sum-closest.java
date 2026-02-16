import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);   // Step 1: sort
        
        int ans = nums[0] + nums[1] + nums[2];  // initial closest sum
        
        for (int i = 0; i < nums.length - 2; i++) {
            
            int l = i + 1;
            int r = nums.length - 1;
            
            while (l < r) {
                
                int sum = nums[i] + nums[l] + nums[r];
                
                // Update answer if closer
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                
                if (sum < target) {
                    l++;       // need bigger sum
                } 
                else if (sum > target) {
                    r--;       // need smaller sum
                } 
                else {
                    return sum;   // exact match
                }
            }
        }
        
        return ans;
    }
}
