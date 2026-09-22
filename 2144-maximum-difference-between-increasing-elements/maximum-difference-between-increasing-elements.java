class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        for(int i =0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                }
                max = Math.max(max, nums[i]-min);
        }
        if(max ==0){
            return -1;
        }
        return max;
    }
}