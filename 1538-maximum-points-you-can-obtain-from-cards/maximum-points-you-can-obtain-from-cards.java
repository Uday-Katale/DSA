class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        for(int i =0; i<k;i++){
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        for(int i=k-1; i>=0; i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[cardPoints.length-k+i];
            maxsum = Math.max(lsum+rsum, maxsum);
        }
        return maxsum;
    }
}