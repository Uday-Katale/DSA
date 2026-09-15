class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int width = right - left;
            if (height[left] < height[right]) {
                max = Math.max(max, height[left] * width);
                left++;
            } else {
                max = Math.max(max, height[right] * width);
                right--;
            }
        }
        return max;
    }
}