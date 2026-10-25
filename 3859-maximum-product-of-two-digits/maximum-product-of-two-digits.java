class Solution {
    public int maxProduct(int n) {
        int l = 0;
        int sl = 0;
        while (n > 0) {
            int unit = n % 10;
            n /= 10;
            if (unit > l) {
                sl = l;
                l = unit;
            } else if (unit > sl) {
                sl = unit;
            }
        }
        return l * sl;
    }
}