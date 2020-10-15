package question7_rotate;

public class Method1 {
    public void rotate(int[][] matrix) {
        // recurtion
        // 矩阵为正方形矩阵
        // 顺时针旋转
        int startX = 0;
        int startY = 0;
        int endX = matrix.length - 1;
        int endY = endX;
        while(startX < endX){
            rotateOuter(matrix,startX++,startY++,endX--,endY--);
        }
    }
    private static void rotateOuter(int[][] matrix,int startX,int startY,int endX,int endY){
        int tmp = 0;
        int i = 0;
        int times = endY - startY;
        while(i < times){
            tmp = matrix[startX][startY + i];
            matrix[startX][startY + i] = matrix[endX - i][startY];
            matrix[endX - i][startY] = matrix[endX][endY - i];
            matrix[endX][endY - i] = matrix[startX + i][endY];
            matrix[startX + i][endY] = tmp;
            i++;
        }
    }
}
