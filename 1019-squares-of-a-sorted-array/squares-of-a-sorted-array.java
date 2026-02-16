class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];
        
        // Step 1: find first positive index
        int pos = 0;
        while (pos < n && nums[pos] < 0) {
            pos++;
        }
        
        // Step 2: square negatives in reverse order
        int i = pos - 1;   // last negative
        int j = pos;       // first positive
        int k = 0;
        
        while (i >= 0 && j < n) {
            
            int left = nums[i] * nums[i];    // reversed negative square
            int right = nums[j] * nums[j];   // positive square
            
            if (left < right) {
                res[k++] = left;
                i--;
            } else {
                res[k++] = right;
                j++;
            }
        }
        
        // remaining negative squares
        while (i >= 0) {
            res[k++] = nums[i] * nums[i];
            i--;
        }
        
        // remaining positive squares
        while (j < n) {
            res[k++] = nums[j] * nums[j];
            j++;
        }
        
        return res;
    }
}
