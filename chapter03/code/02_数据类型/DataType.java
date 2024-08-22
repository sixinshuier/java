import java.math.BigDecimal;

public class DataType {
    public static void main(String[] args) {
        // int 类型
        int iNum1 = 1;
        System.out.println("iNum:"+ iNum1);


        // double 类型
        double dNum1 = 3.14;
        double dNum2 = 3.0;
        double dNum3 = 3;
        double dNum4 = 10.0d;
        double dNum5 = 10D;
        System.out.println("dNum1: "+dNum1);
        System.out.println("dNum2: "+dNum2);
        System.out.println("dNum3: "+dNum3);
        System.out.println("dNum4: "+dNum4);
        System.out.println("dNum5: "+dNum5);

        // float 类型
//        float fNum1 = 3.14;  // 报错：浮点字面量3.14 默认是double类型
        float fNum2 = 3.14f;
        float fNum3 = 3.0f;
        float fNum4 = 3f;
        System.out.println("fNum2:"+ fNum2);
        System.out.println("fNum3:"+ fNum3);
        System.out.println("fNum4:"+ fNum4);

        //  double和float的精度损失的问题解决
        double a = 0.1;
        double b= 0.2;
        double c= a+b;
        System.out.println("a+b="+ c); //0.30000000000000004
        System.out.println("a*b="+ a*b); // 0.020000000000000004

        // 解决方案，使用BigDecimal
        BigDecimal bigNum1 = new BigDecimal("0.1");
        BigDecimal bigNum2 = new BigDecimal("0.2");
        BigDecimal bigNum3 = bigNum2.add(bigNum1);
        System.out.println("0.1+0.2=" + bigNum3);

        // char 类型
        char c1 ='a';  //任意单个字符，加单引号。
        char c2='中';  //任意单个中文字，加单引号。
        char c3 = 111;   //整数。0~65535。十进制、八进制、十六进制均可。输出字符编码表中对应的字符。
        System.out.println("c1: "+ c1);
        System.out.println("c2: "+ c2);
        System.out.println("c3: "+ c3);

        // boolean 类型
        boolean isFalse = false;
        boolean isTrue = true;
        System.out.println("isFalse: " + isFalse);
        System.out.println("isTrue: " + isTrue);
    }
}