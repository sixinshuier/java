public class AutoIncrDecr {
    public static void main(String[] args) {
        int a = 10;
        int b = a++; // a的值现在是11，b的值是10
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

        int c = 10;
        int d = ++c; // c的值现在是11，d的值也是11
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }
}