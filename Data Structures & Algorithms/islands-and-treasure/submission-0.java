class Solution {
    private final static int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public void islandsAndTreasure(int[][] grid) {
        if (grid == null || grid.length == 0) return;
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();

        // Step 1: Add all gates (0) to the queue to start multi-source BFS
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // Step 2: Process the grid level by level
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int r = point[0];
            int c = point[1];

            for (int[] dir : directions) {
                // CORRECT INDEXING: Use fixed 0 and 1 for direction offsets
                int nextR = r + dir[0]; 
                int nextC = c + dir[1];

                // Check bounds and if the cell is an unvisited room INF (2147483647)
                if (nextR >= 0 && nextC >= 0 && nextR < rows && nextC < cols && grid[nextR][nextC] == 2147483647) {
                    // Update to current distance + 1
                    grid[nextR][nextC] = grid[r][c] + 1; 
                    queue.offer(new int[]{nextR, nextC});
                }
            }
        }
    }
}