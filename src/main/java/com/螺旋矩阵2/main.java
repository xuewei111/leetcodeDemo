package main.java.com.螺旋矩阵2;

public class main {

    public static void main(String[] args) {
        int[][] ints = generateMatrix(4);
        for (int[] anInt : ints) {
            for (int i = 0; i < anInt.length; i++) {
                 if((anInt.length - 1) != i) {
                     System.out.print(anInt[i]);
                 }else {
                     System.out.println(anInt[i]);
                 }
            }
        }
    }

    public static int [][] generateMatrix(int n) {
        int loop = 0;  // 控制循环次数
        int[][] res = new int[n][n];
        int start = 0;  // 每次循环的开始点(start, start)
        int count = 1;  // 定义填充数字
        int i, j;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            // 模拟上侧从左到右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            // 模拟右侧从上到下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            // 模拟下侧从右到左
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }

            // 模拟左侧从下到上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }

        return res;
    }
}
