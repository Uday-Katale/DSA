class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res=new ArrayList<>();
        int high= candies[0];
        for(int i=1;i<candies.length;i++){
            if(high<candies[i]){
                high = candies[i];
            }
        }
        for(int i  =0 ; i<candies.length;i++){
            if((candies[i]+ extraCandies)>= high){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}