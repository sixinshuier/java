public class TypeConversion {
    public static void main(String[] args) {
         // int 转 double，自动类型转换
         int i = 123;
         double d = i;
         System.out.println(d); // 123.0
 
         // double 转 int，强制类型转换
         double f = 123.456;
         int b = (int) f;
         System.out.println(b); // 123
 
         // 基本类型装箱和拆箱
         int primitiveInt = 123;
         Integer boxedInt = primitiveInt; // 装箱
         int unboxedInt = boxedInt;       // 拆箱
    }
}