class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // If openCount > 0, this '(' is not the outermost one
                if (openCount > 0) {
                    result.append(ch);
                }
                openCount++;
            } else { // ch == ')'
                openCount--;
                // If openCount > 0 after decrement, this ')' is not the outermost one
                if (openCount > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
        
    }
}