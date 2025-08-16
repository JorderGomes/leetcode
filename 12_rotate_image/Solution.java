class Solution {
    public int[][] rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i <= (rows / 2) + 1; i++) {
            for (int j = 0 + i; j < cols - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - j - 1][i];
                matrix[rows - j - 1][i] = matrix[rows - i - 1][cols - j - 1];
                matrix[rows - i - 1][cols - j - 1] = matrix[j][cols - i - 1];
                matrix[j][cols - i - 1] = temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        matrix = solution.rotate(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
