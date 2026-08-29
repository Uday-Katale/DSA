class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int p1=0;
        for(int i =0;i<t.length();i++){
            if(s.charAt(p1)!=t.charAt(i)){
                continue;
            }
            if(p1==s.length()-1){
                return true;
            }
            p1++;
        }
        return false;
    }
}