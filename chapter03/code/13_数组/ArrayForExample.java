import java.util.Arrays;

public class ArrayForExample {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};

        // for 循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // for each 循环
        for (int num : arr) {
            System.out.println(num);
        }

    }
}