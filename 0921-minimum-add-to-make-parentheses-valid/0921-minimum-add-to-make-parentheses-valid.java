class Solution {
    public int minAddToMakeValid(String s) {
        int openNeeded = 0;  // Counts unmatched '(' needing a ')'
        int closeNeeded = 0; // Counts unmatched ')' needing a '('
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                openNeeded++;
            } else { // ch == ')'
                if (openNeeded > 0) {
                    openNeeded--; // Successfully matched with a previous '('
                } else {
                    closeNeeded++; // Stray ')' with no matching '('
                }
            }
        }
        
        // Total insertions needed = unclosed '(' + unmatched ')'
        return openNeeded + closeNeeded;
    }
}