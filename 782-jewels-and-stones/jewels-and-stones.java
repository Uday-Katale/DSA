class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean [] ar= new boolean[128];
        for(char ch : jewels.toCharArray()){
            ar[ch]=true;
        }
        int count=0;
        for( char ch : stones.toCharArray()){
            if(ar[ch]){
                count++;
            }
        }
        return count;
    }
}