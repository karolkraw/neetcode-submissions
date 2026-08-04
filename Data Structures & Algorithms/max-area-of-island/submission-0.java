class Solution {

    int[][] coords = {
    {1, 0},   
    {0, 1},  
    {0, -1},
    {-1, 0}   
};



    public int maxAreaOfIsland(int[][] grid) {
        
    

        int result = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int temp = dfs(i, j, grid);
                    if (result < temp) result = temp;
                }
            }
        }  

        return result;      
    }

    int dfs(int i, int j, int[][] grid) {
        if (!(i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] != 0)) {
            return 0;
        }

        grid[i][j] = 0;


        int result = 1;

        for (int[] coord: coords) {
            result += dfs(i + coord[0], j + coord[1], grid);
        }

        return result;


    }
}





