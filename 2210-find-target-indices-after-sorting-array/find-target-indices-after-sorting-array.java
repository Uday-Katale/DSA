import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // 1. Sort the array first (required for binary search)
        Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();
        
        // 2. Find the leftmost (first) and rightmost (last) boundaries
        int firstIdx = findBound(nums, target, true);
        
        // If the target is not in the array, return the empty list
        if (firstIdx == -1) {
            return result;
        }
        
        int lastIdx = findBound(nums, target, false);
        
        // 3. Collect all indices from firstIdx to lastIdx
        for (int i = firstIdx; i <= lastIdx; i++) {
            result.add(i);
        }
        
        return result;
    }
    
    // Helper method to find the starting or ending index of target
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int bound = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                bound = mid; // Record potential answer
                if (isFirst) {
                    right = mid - 1; // Keep searching left for the first occurrence
                } else {
                    left = mid + 1;  // Keep searching right for the last occurrence
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return bound;
    }
}
