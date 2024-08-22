public class Variable {
    public static void main(String[] args) {
        // 变量声明
        int intNum;
        float floatNum;


        // 变量声明后，没有初始化就使用。
        int num1;
//        System.out.println(num1); // 编译不过

        //  变量声明和初始化。
        int a=1;
        float b=1.0f;
        double c=3.14;

        // 可以在一行中声明多个变量：
        int i,j;

        /*
        阿里变量命名规范：方法名、参数名、成员变量、局部变量都统一使用 **lowerCamelCase** 风格，必须遵从**驼峰**形式。
正例： localValue / getHttpMessage() / inputUserId
         */
        int localValue = 1;
        String str = getHttpMessage();
    }

    private static String getHttpMessage(){
        return "hello!";
    }
}
