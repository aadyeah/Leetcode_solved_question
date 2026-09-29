class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Define vowels for easy lookup
        String vowels = "aeiou";

        int maxVowel = 0;
        int maxConsonant = 0;

        // Step 2: Iterate through all 26 lowercase English letters
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            
            // Check if character appeared in the string
            if (freq[i] > 0) {
                if (vowels.indexOf(ch) != -1) {
                    // It's a vowel
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    // It's a consonant
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }

        // Step 3: Return the sum of both maximum frequencies
        return maxVowel + maxConsonant;
        
    }
}