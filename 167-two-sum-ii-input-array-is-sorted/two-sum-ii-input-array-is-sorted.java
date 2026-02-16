class Solution {
    /**
     * Finds two numbers in a sorted array that sum to a specific target number.
     * The array is 1-indexed for the return value, but 0-indexed internally.
     * 
     * @param numbers The sorted input array (1-indexed conceptually).
     * @param target The target sum.
     * @return An integer array of size 2, containing the 1-indexed indices of 
     *         the two numbers that sum to the target.
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Problem requires 1-based indexing for the result
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                // Sum is too small, need a larger number, so increment left pointer
                left++;
            } else {
                // Sum is too large, need a smaller number, so decrement right pointer
                right--;
            }
        }

        // According to the problem description, there will always be exactly one solution,
        // so this line is never reached.
        return new int[]{};
    }
}
