public class ArrayExample {
    public static void main(String[] args) {
        // 声明数组变量
        int[] a;
        int b[];

        // 创建数组: 指定数组元素个数
        int[] arr1 = new int[5]; 
        System.out.println(arr1[0]);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i;
        }

        

        // 以下标的形式，取数组的形式
        System.out.println(arr1[1]);

        // 超出数组长度
        // System.out.println(arr1[5]); // java.lang.ArrayIndexOutOfBoundsException:

        int[] arr2 = {1, 2, 3, 4, 5, 6};
    } 
}
