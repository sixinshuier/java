public class StringNull {

    public static void main(String[] args) {
        // 空串
        String str1 = "";
        if (str1 != null && str1.length() == 0) {
            System.out.println("这是一个空串");
        }

        // Null串
        String str2 = null;
        if (str2 == null) {
            System.out.println("这是一个Null串");
        }
    }
}