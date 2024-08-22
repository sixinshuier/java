import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        // 创建一个数组
        int[] array = new int[]{9, 5, 3, 7, 2, 8, 4, 1, 6};

        // 使用Arrays类的sort()方法对数组进行排序
        Arrays.sort(array);

        // 打印排序后的数组
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
