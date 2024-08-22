public class TwoDimensionalArray {
    public static void main(String[] args) {
         // 声明并初始化一个二维数组
      int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
      
      // 输出二维数组的元素
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
    }
}
