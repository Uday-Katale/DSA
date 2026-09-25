class Solution {
    public boolean checkIfPangram(String sentence) {
        // boolean[] seen = new boolean[26];
        // for (char ch : sentence.toCharArray()) {
        //     seen[ch - 'a'] = true;
        // }
        // for (boolean b : seen) {
        //     if (!b) {
        //         return false;
        //     }
        // }
        // return true;

        if(sentence.length()<26){
            return false;
        }
        for( char ch= 'a'; ch<='z'; ch++){
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}