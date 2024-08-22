public class BlockScopeExample {
    public static void main(String[] args) {
        int x = 10;  // 这个变量x在整个main方法中都是有效的

        {
            int y = 20;  // 这个变量y只在这个大括号内有效
            System.out.println("x = " + x + ", y = " + y);  // 在这里可以访问x和y
        }

        System.out.println("x = " + x);  // 在这里可以访问x
        // System.out.println("y = " + y);  // 错误：在这里无法访问y，因为y的作用域只在上面的大括号中
    }
}
