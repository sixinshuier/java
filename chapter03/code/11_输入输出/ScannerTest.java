import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // 创建一个Scanner对象
        System.out.println("输入一个整数");

        int num = myObj.nextInt(); // 读取用户输入的整数

        System.out.println("您输入的整数是: " + num); // 输出用户输入

        Scanner strObj = new Scanner(System.in); // 创建一个Scanner对象
        System.out.println("输入一个字符串");
        String str = strObj.nextLine(); // 读取用户输入的字符串

        System.out.println("您输入的字符串是: " + str); // 输出用户输入
    }
}
