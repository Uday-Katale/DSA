class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // return (nums[nums.length-1] -1)*(nums[nums.length-2]-1); 
        int fl = 0;
        int sl = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= fl) {
                sl = fl;
                fl = nums[i];
            } else if ( nums[i] >= sl) {
                sl = nums[i];
            }
        }
        return (fl-1)* (sl-1);
    }
}