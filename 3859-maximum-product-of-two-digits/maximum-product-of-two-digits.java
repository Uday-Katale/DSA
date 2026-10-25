class Solution {
    public int maxProduct(int n) {
        int largest =0;
        int slargest = 0;
        
        while(n>0){
            int unit = n%10;
            n/=10;
            if( unit> largest ){
                slargest = largest;
                largest = unit;
            }else if(unit <= largest && unit >slargest){
                slargest= unit;
            }
            
        }
        return largest * slargest;
    }
}