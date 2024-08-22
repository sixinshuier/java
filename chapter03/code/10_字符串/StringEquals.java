public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        // 使用 equals() 方法判断 str1 和 str2 是否相等
        if (str1.equals(str2)) {
            System.out.println("str1 和 str2 相等");
        } else {
            System.out.println("str1 和 str2 不相等");
        }

        // 使用 equals() 方法判断 str1 和 str3 是否相等
        if (str1.equals(str3)) {
            System.out.println("str1 和 str3 相等");
        } else {
            System.out.println("str1 和 str3 不相等");
        }
    }
}