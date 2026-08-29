class Solution {
    public boolean judgeSquareSum(int c) {
        // long left=0;
        // long right=(long) Math.sqrt(c);

        // while(left<=right){
        //     long sum= (left*left) + (right*right);
        //     if(sum==c){
        //         return true;
        //     }else if(sum<c){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return false;
        long left = 0;
        long right = (long) Math.sqrt(c);
        
        while (left <= right) {
            long currentSum = (left * left) + (right * right);
            
            if (currentSum == c) {
                return true; // Match found!
            } else if (currentSum < c) {
                left++; // Sum is too small, shift left pointer up
            } else {
                right--; // Sum is too big, shift right pointer down
            }
        }
        
        return false;
    }
}