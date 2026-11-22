class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] x = new int[n - 2][n - 2];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                x[i - 1][j - 1] = Math.max(grid[i][j], Math.max(grid[i - 1][j - 1], Math.max(grid[i - 1][j], Math.max(grid[i - 1][j + 1], Math.max(grid[i][j - 1], Math.max(grid[i][j + 1], Math.max(grid[i + 1][j - 1], Math.max(grid[i + 1][j], grid[i + 1][j + 1]))))))));
            }
        }
        return x;
        
    }
}