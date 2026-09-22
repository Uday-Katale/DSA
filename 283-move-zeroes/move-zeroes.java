class Solution {
    public void moveZeroes(int[] nums) {
        int point = 0;
        for (int num : nums) if (num != 0) nums[point++] = num;
        for (int i = point; i < nums.length; i++) nums[i] = 0;
    }
}