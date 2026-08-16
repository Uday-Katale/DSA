class Solution {
    private int start, maxLen;

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        for (int i = 0; i < n - 1; i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }

        return s.substring(start, start + maxLen);
    }

    private void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (right - left - 1 > maxLen) {
            maxLen = right - left - 1;
            start = left + 1;
        }
    }
}