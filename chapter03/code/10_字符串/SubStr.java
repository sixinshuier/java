public class SubStr {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String subStr1 = str.substring(7);  // 结果是 "World!"
        String subStr2 = str.substring(7, 12);  // 结果是 "World"
        System.out.println(subStr1);
        System.out.println(subStr2);
    }
}
