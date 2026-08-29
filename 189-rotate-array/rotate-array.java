class Solution {
    public void rotate(int[] nums, int k) {
        k %=nums.length;
        int left =0;
        int right = nums.length-1;
        while(left<right){
            nums[left]+=nums[right];
            nums[right]= nums[left]-nums[right];
            nums[left]= nums[left]-nums[right];
            left++;
            right--;
        }
        left= 0;
        right=k-1;
        while(left<right){
            nums[left]+=nums[right];
            nums[right]= nums[left]-nums[right];
            nums[left]= nums[left]-nums[right];
            left++;
            right--;
        }
        left=k;
        right=nums.length-1;
        while(left<right){
            nums[left]+=nums[right];
            nums[right]= nums[left]-nums[right];
            nums[left]= nums[left]-nums[right];
            left++;
            right--;
        }
    }
}