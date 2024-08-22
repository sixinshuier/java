public class PrintTest {
    public static void main(String[] args) {
        // %s 字符串的格式化输出
        System.out.printf("Hello, %s!", "world");

        // %d 整数的格式化输出
        System.out.printf("I have %d apples.", 5);

        // %f 浮点数的格式化输出
        System.out.printf("The value of pi is approximately %f.", 3.1415926);

        // %.nf：用于控制浮点数的小数位数，n代表小数位数
        System.out.printf("The value of pi to 2 decimal places is %.2f.", 3.1415926);
    }
}
