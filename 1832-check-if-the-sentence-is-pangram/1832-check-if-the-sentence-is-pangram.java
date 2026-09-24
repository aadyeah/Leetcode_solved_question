class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        // Step 1: Create a checklist for the 26 letters
        boolean[] seen = new boolean[26];

        // Step 2: Traverse the string and check off the letters we find
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            // Map character 'a'-'z' to index 0-25 and mark it true
            seen[ch - 'a'] = true;
        }

        // Step 3: Verify if all boxes are checked (true)
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                return false; // Found a missing letter!
            }
        }

        return true; // All 26 letters were present
        
    }
}