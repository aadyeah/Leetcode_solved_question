class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd-length center at i
            int len1 = expandAroundCenter(s, i, i);
            // Case 2: Even-length center between i and i + 1
            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLen = Math.max(len1, len2);

            // If a longer palindrome is found, update the substring boundaries
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        // substring takes [beginIndex, endIndex)
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Length of the valid palindrome before the mismatch broke the loop
        return (right - 1) - (left + 1) + 1;
        
    }
}