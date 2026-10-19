class Solution {
    public int subtractProductAndSum(int n) {
        int prod =1;
        int sum =0;
        while (n !=0){
            int unit = n%10;
            prod*= unit;
            sum+=unit;
            n/=10;

        }
        return prod-sum;
    }
}