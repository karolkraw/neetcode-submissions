class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int i = (left + right) / 2;
            int currentRow = i / columns;
            int currentColumn = i % columns;
            if (matrix[currentRow][currentColumn] < target) {
                left = i + 1;
            }
            else if(matrix[currentRow][currentColumn] > target) {
                right = i - 1;
            }
            else {
                return true;
            }
        }

        return false;
        
    }
}
