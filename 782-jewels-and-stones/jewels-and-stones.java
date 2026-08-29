class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean [] ar= new boolean[128];
        for(int i =0; i<jewels.length(); i++){
            ar[jewels.charAt(i)]=true;
        }
        int count=0;
        for(int i =0;i <stones.length(); i++){
            if(ar[stones.charAt(i)]){
                count++;
            }
        }
        return count;
    }
}