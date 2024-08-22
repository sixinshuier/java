public class Annotation {
    public static void main(String[] args) {
        // 注解方式一： 这是一个单行注释
        int numA = 5; // numA 初始化为 5
        int numB = 4; // numB 初始化为 4

        // 注解方式二： 多行注释
        /*
          以星号和斜杠 开始和结束
         */
        int result = add(numA, numB);
        System.out.println("result: "+  result);

    }

    /**
     * 注解方式三：文档注释
     * @param a
     * @param b
     * @return
     */
    private static int add(int a, int b) {
        return a+b;
    }
}