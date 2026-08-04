class Solution {
    private final static int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public void islandsAndTreasure(int[][] grid) {
        if (grid == null || grid.length == 0) return;

        // Start DFS only from the gates (0)
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    dfs(i, j, grid, 0);
                }
            }
        }
    }

    private void dfs(int i, int j, int[][] grid, int currentDistance) {
        // 1. Out of bounds check
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }

        // 2. Obstacle check
        if (grid[i][j] == -1) {
            return;
        }

        // 3. Distance optimization check
        // Only update and continue if the new path is shorter than the stored value.
        // This stops infinite loops (e.g., going back to the cell we just came from).
        if (currentDistance > grid[i][j]) {
            return;
        }

        // Update the grid with the shorter distance
        grid[i][j] = currentDistance;

        // 4. Explore all 4 directions
        for (int[] dir : directions) {
            // FIXED: Using index 0 and 1 instead of i and j
            int nextI = i + dir[0];
            int nextJ = j + dir[1];
            
            dfs(nextI, nextJ, grid, currentDistance + 1);
        }
    }
}