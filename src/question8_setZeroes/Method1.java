package question8_setZeroes;

import java.util.HashSet;
import java.util.Set;

public class Method1 {
    // 在我本地环境中 我的程序运行是正确的，不过无法通过代码测试用例
    private static Set<Integer> zeroXSet = new HashSet<>();
    private static Set<Integer> zeroYSet = new HashSet<>();

    public static void setZeroes(int[][] matrix) {
        traverseMatrix(matrix);
        setZeroesAtX(matrix);
        setZeroesAtY(matrix);
    }

    private static void traverseMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroXSet.add(i);
                    zeroYSet.add(j);
                }
            }
        }
    }

    private static void setZeroesAtX(int[][] matrix){
        for(Integer i : zeroXSet){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = 0;
            }
        }
    }
    private static void setZeroesAtY(int[][] matrix){
        for(Integer j : zeroYSet){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][j] = 0;
            }
        }
    }
    private static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        printMatrix(matrix);
        System.out.println("---------");
        setZeroes(matrix);
        printMatrix(matrix);
    }
}
