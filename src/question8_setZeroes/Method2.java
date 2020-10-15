package question8_setZeroes;

public class Method2 {

    public void setZeroes(int[][] matrix) {
        // 用两个一维数组存放要清理的行和列
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        // 找到要清理的行和列
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // clear row
        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // clear column
        for (int j = 0; j < column.length; j++) {
            if (column[j]) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
