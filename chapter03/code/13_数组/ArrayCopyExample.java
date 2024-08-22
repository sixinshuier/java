import java.util.Arrays;

public class ArrayCopyExample {

    public static void main(String[] args) {

        // 方式一：数组间的copy
        int[] array1 = { 23, 43, 55, 12 };
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        for (int num : array2) {
            System.out.print(num + " ");
        }

        // 方式二：Arrays.copyOf
        int[] array3 = { 12, 43, 55, 22 };
        int[] array4 = Arrays.copyOf(array1, array3.length);

        for (int num : array4) {
            System.out.print(num + " ");
        }

        // 方式三：
        int[] array5 = { 3, 43, 55, 12 };
        int[] array6 = array5.clone();
        for (int num : array6) {
            System.out.print(num + " ");
        }
    }
}