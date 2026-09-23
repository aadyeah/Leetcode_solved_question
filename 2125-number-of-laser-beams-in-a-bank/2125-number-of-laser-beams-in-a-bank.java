class Solution {
    public int numberOfBeams(String[] bank) {
        int totalBeams = 0;
        int prevDevices = 0;

        for (String row : bank) {
            int currDevices = 0;

            // Count devices ('1's) in the current row
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == '1') {
                    currDevices++;
                }
            }

            // If the current row contains devices, form beams with the previous active row
            if (currDevices > 0) {
                totalBeams += prevDevices * currDevices;
                prevDevices = currDevices; // Update for the next active row
            }
        }

        return totalBeams;
        
    }
}