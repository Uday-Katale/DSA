class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessThan = 0;
        int count = 0;
        
        // Single pass to count positions
        for (int num : nums) {
            if (num < target) {
                lessThan++;
            } else if (num == target) {
                count++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        // Reconstruct the indices directly
        for (int i = 0; i < count; i++) {
            result.add(lessThan + i);
        }
        
        return result;
    }
}