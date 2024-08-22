## 注释

#### 作用：

Java 注释用于提供代码的解释和说明，它们不会被编译器执行，但是可以在代码中保留下来，供阅读代码的人理解代码的意图和功能。

#### 用法：

Java 中有三种类型的注释：

1. **单行注释**：使用两个斜杠 `//` 开始，仅在当前行有效。

   ```java
   // 这是一个单行注释
   int number = 5; // 这行代码声明了一个整数变量
   ```

2. **多行注释**：使用斜杠和星号 `/*` 开始，星号和斜杠 `*/` 结束，可以跨越多行。

   ```java
   /* 这是一个
      多行注释 */
   int number = 5;
   ```

3. **文档注释**：使用斜杠和两个星号 `/**` 开始，用于生成API文档。这种注释可以包含一些特殊的注释标记，如`@param`、`@return`、`@throws`等。

   ```java
   /**
    * 这是一个文档注释
    * @param args 命令行参数
    */
   public static void main(String[] args) {
       // ...
   }
   ```

注释的主要作用包括：

- **解释代码**：帮助其他开发者或未来的你理解代码的意图和功能。
- **临时移除代码**：在调试过程中，可以使用注释临时移除代码段，而不是删除它们。
- **提供历史记录**：注释可以记录代码的变更历史或特定决策的原因。
- **生成文档**：文档注释可以被工具如Javadoc用来生成正式的API文档。
- **防止代码执行**：虽然这不是注释的主要目的，但有时可以将代码放在注释中以防止其执行，同时保留代码以供参考。

正确和一致地使用注释可以大大提高代码的可读性和可维护性。

## 数据类型

> Java 是强类型语言：强类型语言（Strongly Typed Language）是指在编译时，类型检查非常严格，变量和表达式的数据类型必须明确指定，并且在编译时进行类型检查的语言。

在Java中，一共有8种基本类型（primitive type），其中有4种整型、2种浮点类型、1种用于表示Unicode编码的字符单元的字符类型char和1种用于表示真值的boolean类型。

#### 整型

整型用于表示没有小数部分的数值，它允许是负数。Java提供了4种整型。

| 类型  | 存储需求 | 取值范围                                  |
| ----- | -------- | ----------------------------------------- |
| int   | 4字节    | -2147483648～2147483647                   |
| short | 2字节    | -32768～32767                             |
| long  | 8字节    | -9223372036854775808～9223372036854775807 |
| byte  | 1字节    | -128～127                                 |

- 在Java中，整型的范围与运行Java代码的机器无关。
- Java没有任何无符号（unsigned）形式的int、long、short或byte类型。

#### 浮点类型

在Java中，double和float都是**基本数据类型**，用于表示浮点数（即带有小数点的数）。

它们在**精度和范围**上有所不同：

double类型提供了更高的精度和更大的范围，而float类型则精度更低，范围更少；

##### double 类型

- double类型的变量用于存储**双精度浮点数**，可以表示更大范围和更高精度的浮点数。double类型的字面量在赋值给double类型变量时不需要特殊后缀（也可以加D或d）。
  - 使用一个浮点数字面量（如3.14），Java会将其视为double类型。
  - 如果直接使用一个整型（如10），Java会进行自动类型转换，即从int **自动转换** 为double类型。

```java
				double num1 = 3.14;
        double num2 = 3.0; 
        double num3 = 3; // 类型自动转换
        double num4 = 10.0d;
        double num5 = 10D;
```

##### float 类型

float类型的变量用于存储**单精度浮点数**，范围和精度较小。在声明float类型的变量并赋值时，需要在浮点数字面量后加上F或f后缀。

- 在声明float类型的变量并给它赋值时：
  - 如果你直接使用一个浮点数字面量（如3.14），Java会将其视为double类型，因为浮点数字面量默认是double类型的。为了避免编译错误，你需要在数值后面加上F或f后缀来明确表示这是一个float类型的字面量。（或者使用 **强制类型转换**，不建议，会产生精度损失）
  - 如果直接使用一个整型（如3），Java会进行自动类型转换，即从int **自动转换** 为float类型。

**练习题**：分别有三个变量,a,b,c，请问一下的定义中哪些有错误

```java
        float a=2; // int -> float 类型自动转换
        float b=2.5;
        float c=3.0f;
```

>  double和float的精度损失

```java
        //  double和float的精度损失的问题解决
        double a = 0.1;
        double b= 0.2;
        double c= a+b;
        System.out.println("a+b="+ c); // 0.30000000000000004
        System.out.println("a*b="+ a*b); // 0.020000000000000004
```

解决方式：

```java
        // 解决方案，使用BigDecimal
        BigDecimal bigNum1 = new BigDecimal("0.1");
        BigDecimal bigNum2 = new BigDecimal("0.2");
        BigDecimal bigNum3 = bigNum2.add(bigNum1);
        System.out.println("0.1+0.2=" + bigNum3);
```

#### char 类型

char类型原本用于表示单个字符。char类型的字面量值要用**单引号括**起来。用于存储单个Unicode字符。它使用两个字节来表示一个字符，允许存储所有Unicode代码点，从0x0000到0xFFFF。

```java
        char c1 ='a';  //任意单个字符，加单引号。
        char c2='中';  //任意单个中文字，加单引号。
        char c3 = 111;   //整数。0~65535。十进制、八进制、十六进制均可。输出字符编码表中对应的字符。
        System.out.println("c1: "+ c1);
        System.out.println("c2: "+ c2);
        System.out.println("c3: "+ c3);
```

### boolean 类型

boolean（布尔）类型有两个值：false和true，用来判定逻辑条件。整型值和布尔值之间不能进行相互转换。

```java
        // boolean 类型
        boolean isFalse = false;
        boolean isTrue = true;
        System.out.println("isFalse: " + isFalse);
        System.out.println("isTrue: " + isTrue);
```

## 变量

### 变量声明

在Java中，每个变量都有一个类型（type）。在声明变量时，变量的类型位于变量名之前。

```java
        //  变量声明
        int a;
        float b;
        double c;
```

声明一个变量之后，必须用赋值语句对变量进行显式初始化，千万不要使用未初始化的变量。

```java
        // 变量声明
        int num1;
        System.out.println(num1); // 编译不过
```

### 变量初始化

先声明再初始化

```java
       int a;
       a = 1;
```

声明并初始化

```java
        int a=1;
        float b=1.0f;
        double c=3.14;
```

### **阿里变量命名规范**：

方法名、参数名、成员变量、局部变量都统一使用 **lowerCamelCase** 风格，必须遵从**驼峰**形式。
正例： localValue / getHttpMessage() / inputUserId

```java
   public static void main(String[] args) {
        int localValue = 1;
        String str = getHttpMessage();
    }

    private static String getHttpMessage(){
        return "say hello~";
    }
```

- 禁止拼音英文混用；
- 禁止下划线、美元符号起始。
- **可读性比长度重要：**命名尽可能短，但“望文生义”更重要。
- 不能使用Java保留字作为变量名。

可以在一行中声明多个变量：

```java
        // 可以在一行中声明多个变量：
        int i,j;
```

## 常量

在Java中，利用关键字final指示常量。关键字final表示这个变量只能被赋值一次。一旦被赋值之后，就不能够再更改了。习惯上，**常量名使用全大写。** 多个单词时以下划线链接。

```java
    public static final Integer HOUR  =24;

    public static  final String APP_NAME="application";
```

## 运算符

### 数学函数与变量

 Java中的Math类提供了许多用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。以下是一些代码示例：

1. 计算两个数的最大值和最小值：

```java
int a = 10;
int b = 20;
System.out.println("最大值: " + Math.max(a, b));
System.out.println("最小值: " + Math.min(a, b));
```

2. 计算平方根：

```java
double c = 25;
System.out.println("平方根: " + Math.sqrt(c));
```

3. 计算绝对值：

```java
int d = -10;
System.out.println("绝对值: " + Math.abs(d));
```

4. 计算随机数：

```java
System.out.println("随机数: " + Math.random());
```

### 数值类型之间的转换

在Java中，数值类型的转换可以分为以下几种情况：

1. **自动类型转换（隐式）**：小范围类型自动转换为大范围类型，有6个实心箭头，表示无信息丢失的转换；有3个虚箭头，表示可能有精度损失的转换。

<img src="./images/image-20240821111827800.png" alt="image-20240821111827800" style="zoom:50%;" />

```java
int i = 123;
double d = i; // int 转 double，自动类型转换
```

2. **强制类型转换（显式）**：大范围类型转换为小范围类型时，需要进行强制类型转换，但这可能导致精度损失或溢出：

```java
double d = 123.456;
int i = (int) d; // double 转 int，强制类型转换
```

3. **基本类型装箱和拆箱**：基本类型与其对应的包装类（如 `Integer`、`Double` 等）之间可以自动装箱（转换为对象）和拆箱（转换为基本类型）。

```java
int primitiveInt = 123;
Integer boxedInt = primitiveInt; // 装箱
int unboxedInt = boxedInt;       // 拆箱
```

### 结合赋值与运算符

可以在赋值中使用二元运算符，这是一种很方便的简写形式。例如：

```java
x+=4;
//等价于
x=x+4;
```

### 自增与自减运算符

 在Java中，自增和自减运算符非常常见，它们分别是++和--。

自增运算符：

```java
int a = 10;
a++; // a的值现在是11
```

自减运算符：

```java
int b = 20;
b--; // b的值现在是19
```

需要注意的是，这两个运算符都有前缀和后缀两种形式，即++a/--a和a++/a--。前缀形式先进行运算再返回值，后缀形式先返回值再进行运算。

例如：

```java
int a = 10;
int b = a++; // a的值现在是11，b的值是10

int c = 10;
int d = ++c; // c的值现在是11，d的值也是11
```

同样的规则也适用于自减运算符。

### 关系和boolean 运算符

 在Java中，关系和布尔运算符用于比较两个或多个操作数并返回一个布尔值。以下是一些代码示例：

关系运算符：

```java
int a = 10;
int b = 20;

System.out.println(a == b); // false
System.out.println(a != b); // true
System.out.println(a > b); // false
System.out.println(a < b); // true
System.out.println(a >= b); // false
System.out.println(a <= b); // true
```

布尔运算符：

```java
boolean x = true;
boolean y = false;

System.out.println(x && y); // false
System.out.println(x || y); // true
System.out.println(!x); // false
System.out.println(!y); // true
```

在上述示例中，关系运算符用于比较两个整数的值，而布尔运算符用于操作布尔值。

### 位运算符

 位运算是一种基于二进制的计算方式，常用的位运算有：与(&)、或(|)、非(~)、异或(^)、左移(<<)、右移(>>)、无符号右移(>>>)等。下面是一些Java位运算的代码示例：

```java
public class BitOperation {
    public static void main(String[] args) {
        int a = 60;    /* 60 = 0011 1100 */
        int b = 13;    /* 13 = 0000 1101 */
        int c = 0;

        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
    }
}
```
### 括号与运算符级别

 在Java中，括号和运算符的优先级是非常重要的。括号可以改变运算的顺序，而运算符的优先级则决定了在没有括号的情况下，运算的执行顺序。

例如，我们有以下的代码：

```java
int a = 10;
int b = 20;
int c = 30;
int result = a + b * c;
```

在这个例子中，由于乘法运算符(*)的优先级高于加法运算符(+)，所以先进行b和c的乘法运算，然后再与a相加。结果是610，而不是900。

但是，如果我们使用括号改变了运算的顺序：

```java
int a = 10;
int b = 20;
int c = 30;
int result = (a + b) * c;
```

在这个例子中，由于括号的优先级最高，所以先进行a和b的加法运算，然后再与c相乘。结果是900，而不是610。

### 枚举类型

 Java枚举（Enum）是一种特殊的类，它代表了一组常量（unchangeable variables，如：季节，颜色等）。下面是一个简单的Java枚举代码示例：

```java
public class Main {
    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
```
在这个示例中，我们定义了一个名为Color的枚举，它有三个成员：RED，GREEN和BLUE。然后在main方法中，我们创建了一个Color类型的变量c1，并将其设置为Color.RED。最后，我们打印出变量c1的值，输出结果应为“RED”。

枚举可以有构造函数，方法和变量，就像普通的Java类一样。这使得我们可以为每个枚举成员分配自定义的值或行为。例如：

```java
public class Main {
    enum Color {
        RED("红色"), GREEN("绿色"), BLUE("蓝色");

        private String value;

        Color(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1.getValue());
    }
}
```
在这个示例中，我们为Color枚举添加了一个私有变量value和一个公共方法getValue()。然后我们在枚举成员定义时为每个成员分配了一个自定义的值。在main方法中，我们可以通过调用getValue()方法来获取枚举成员的自定义值。输出结果应为“红色”。

## 字符串

Java字符串是Java编程中的一种基本数据类型，用于存储和操作一系列的字符。在Java中，字符串是不可变的，这意味着一旦创建了字符串，就不能改变它。如果需要修改字符串，Java会创建一个新的字符串对象来存储修改后的字符串，而原始的字符串仍然保持不变。

 在Java中，我们可以通过以下方式定义字符串：

```java
String str = "Hello, World!";
```

在这个示例中，我们定义了一个名为`str`的字符串变量，并将其初始化为`Hello, World!`。

我们也可以使用`new`关键字来创建一个新的字符串对象：

```java
String str = new String("Hello, World!");
```

【高】这两种方式都可以用来定义字符串，但是它们之间存在一些差异。使用双引号定义的字符串会被存储在字符串常量池中，如果有相同的字符串已经存在于池中，Java会直接使用已经存在的字符串，而不会创建新的字符串。而使用`new`关键字创建的字符串则会在堆内存中创建一个新的字符串对象，即使池中已经存在相同的字符串。

### 子串

 在Java中，我们可以使用substring()方法来获取字符串的子串。这个方法有两种形式：

1. substring(int beginIndex)：返回一个新的字符串，它是此字符串的一个子字符串。子字符串从指定的 beginIndex 处开始，直到此字符串的末尾。

2. substring(int beginIndex, int endIndex)：返回一个新字符串，它是此字符串的一个子字符串。子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。因此，子字符串的长度为 endIndex-beginIndex。

这里是一个例子：

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String subStr1 = str.substring(7);  // 结果是 "World!"
        String subStr2 = str.substring(7, 12);  // 结果是 "World"
        System.out.println(subStr1);
        System.out.println(subStr2);
    }
}
```

### 拼接

 在Java中，我们可以使用多种方法来拼接字符串。以下是一些常见的示例：

1. 使用 "+" 运算符：
```java
String str1 = "Hello";
String str2 = "World";
String str3 = str1 + str2;
System.out.println(str3);  // 输出 "HelloWorld"
```

2. 使用 String.concat() 方法：
```java
String str1 = "Hello";
String str2 = "World";
String str3 = str1.concat(str2);
System.out.println(str3);  // 输出 "HelloWorld"
```

3. 使用 StringBuilder.append() 方法：
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append("World");
System.out.println(sb.toString());  // 输出 "HelloWorld"
```

4. 使用 String.format() 方法：
```java
String str1 = "Hello";
String str2 = "World";
String str3 = String.format("%s%s", str1, str2);
System.out.println(str3);  // 输出 "HelloWorld"
```

### 不可变字符串

字符串被设计为不可变的。这是因为字符串通常被用作许多Java类的参数，例如网络连接、打开文件、线程名等。如果允许改变这些字符串，那么可能会导致严重的安全问题。例如，网络连接可能会被重定向，文件可能会被删除，等等。此外，由于字符串是不可变的，它们可以被安全地用于多线程环境，而无需额外的同步。

### 判断字符串是否相等

 在Java中，我们可以使用 `equals()` 方法来判断两个字符串是否相等。以下是一个代码示例：

```java
public class Main {
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
```

### 空串与Null串

空串（""）和Null串是有区别的。空串是一个实例化了的对象，只是它不包含任何元素；而Null串则表示这个对象还没有被实例化。

以下是一些代码示例：

```java
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
```

在使用时，我们需要注意对Null串进行操作（如调用方法）会抛出NullPointerException，所以在使用前通常需要进行非空检查。而空串可以正常调用方法，只是其内容为空。

## 输入输出

### 读取输入

可以使用**Scanner**类来读取用户的输入。首先，我们需要导入**java.util.Scanner**包，然后创建一个新的Scanner对象。例如，我们可以使用以下代码来读取用户输入的整数：

```java
import java.util.Scanner;  // 导入Scanner类

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // 创建一个Scanner对象
    System.out.println("输入一个整数");

    int num = myObj.nextInt();  // 读取用户输入的整数

    System.out.println("您输入的整数是: " + num);  // 输出用户输入
  }
}
```

在这个例子中，`nextInt()`方法用于读取用户输入的整数。如果我们想要读取字符串，我们可以使用`nextLine()`方法。例如：

```java
import java.util.Scanner;  // 导入Scanner类

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // 创建一个Scanner对象
    System.out.println("输入一些文字");

    String str = myObj.nextLine();  // 读取用户输入的字符串

    System.out.println("您输入的文字是: " + str);  // 输出用户输入
  }
}
```

### 格式化输出

使用System.out.printf()方法来进行格式化输出。

1. %s：用于字符串的格式化输出。
```java
System.out.printf("Hello, %s!", "world");
```
输出结果为：Hello, world!

2. %d：用于整数的格式化输出。
```java
System.out.printf("I have %d apples.", 5);
```
输出结果为：I have 5 apples.

3. %f：用于浮点数的格式化输出。
```java
System.out.printf("The value of pi is approximately %f.", 3.1415926);
```
输出结果为：The value of pi is approximately 3.141593.

4. %.nf：用于控制浮点数的小数位数，n代表小数位数。
```java
System.out.printf("The value of pi to 2 decimal places is %.2f.", 3.1415926);
```
输出结果为：The value of pi to 2 decimal places is 3.14.

5. %x：用于十六进制数的格式化输出。
```java
System.out.printf("The hexadecimal representation of 255 is %x.", 255);
```
输出结果为：The hexadecimal representation of 255 is ff。

## 控制流程

### 块作用域

 块作用域是指在一对大括号{}中定义的区域。在这个区域中声明的变量，只在这个区域内有效。一旦超出这个区域，这些变量就会失效。以下是一个简单的代码示例：

```java
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
```

### 条件语句

条件语句主要有if语句、if-else语句、switch语句等。以下是这些条件语句的代码示例：

1. if语句：

```java
int score = 85;
if (score > 60) {
    System.out.println("及格");
}
```
2. if-else语句：

```java
int score = 85;
if (score >= 90) {
    System.out.println("优秀");
} else if (score >= 80) {
    System.out.println("良好");
} else if (score >= 60) {
    System.out.println("及格");
} else {
    System.out.println("不及格");
}
```
3. switch语句：

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("星期一");
        break;
    case 2:
        System.out.println("星期二");
        break;
    case 3:
        System.out.println("星期三");
        break;
    // ...其他情况
    default:
        System.out.println("输入错误");
}
```
**什么时候使用if-elseif ？ 什么时候使用switch？**

if和switch语句都是用来进行条件判断的，但是它们的使用场景和方式有所不同。

if语句适用于条件较少，或者条件之间有复杂关系的情况。例如，当条件之间存在“并且”、“或者”等逻辑关系时，或者当条件是一个范围时（如：if (x > 0 && x < 10)），我们通常会使用if语句。

而switch语句适用于条件较多，且条件之间相互独立的情况。例如，当我们需要根据一个变量的不同取值进行不同的处理时，可以使用switch语句，这样可以使代码更加清晰、易读。但是，switch语句的条件只能是整数、字符、字符串或者枚举类型，不能是浮点数，也不能是范围。

### 循环

while循环是一种控制流语句，它允许代码被重复执行，直到满足特定的条件。while循环的基本语法如下：

```java
while (条件) {
  // 循环体（需要重复执行的代码）
}
```

在这个结构中，“条件”是一个布尔表达式，如果其结果为true，那么循环体内的代码就会被执行。一旦条件不再满足（即，条件的结果为false），循环就会停止。

例如，下面的代码将打印数字1到5：

```java
int i = 1;
while (i <= 5) {
  System.out.println(i);
  i++;
}
```

在这个例子中，只要变量i的值小于或等于5，就会打印i的值并将i增加1。当i的值变为6时，条件“i <= 5”就不再满足，因此循环停止。

### 确定循环

 Java中的for循环是一种控制流语句，它可以让一段代码重复执行。基本的for循环包括三个部分：初始化、条件测试和迭代。以下是一个简单的for循环示例：

```java
for(int i = 0; i < 5; i++){
    System.out.println(i);
}
```
在这个例子中，我们首先初始化一个变量i为0，然后在每次循环开始时检查条件（i是否小于5）。如果条件为真，我们就执行循环体（打印变量i的值），然后进行迭代（i增加1）。当i等于5时，条件测试失败，循环结束。

for循环非常适合于当你知道循环需要执行的次数时使用。例如，遍历数组或集合的元素，或者重复执行固定次数的操作。

### 多重选择

 switch语句是一种选择控制机制，用于执行多个代码块之一。基本的switch语句包括以下部分：

- switch关键字
- 一个变量或表达式
- 多个case和default标签

这是一个基本的switch语句的例子：

```java
switch(expression) {
   case value1 :
      // 代码语句
      break; // 可选
   case value2 :
      // 代码语句
      break; // 可选
   // 你可以有任意数量的case语句
   default : // 可选
      // 代码语句
}
```

在这个例子中，表达式被评估一次，其值与每个case进行比较。如果存在匹配，与该case关联的代码被执行。break关键字用于在执行完一个case后，跳出switch语句。如果删除break，程序将继续执行下一个case。如果没有case匹配，且存在default语句，那么default语句的代码将被执行。

注意：Java中的switch语句可以与byte，short，int，char，enum类型一起使用，从Java 7开始，还可以与String类型一起使用。

### 中断流程语句

**break**：

 用于跳出循环语句。它可以用在所有的循环语句中，如for、while以及do-while循环语句中。当执行到break语句时，将会结束最近的包含该break语句的循环。如果在嵌套循环中使用，它将只结束最近的一层循环。

例如，下面的代码将会输出数字1到4，当i等于5时，循环将会因为break语句而结束。

```java
for(int i=1; i<=10; i++){
    if(i==5){
        break;
    }
    System.out.println(i);
}
```

此外，break语句还可以用在switch语句中，用来结束一个case。如果在case语句中不写break，那么程序将会继续执行下一个case，直到遇到break语句或者switch语句结束。

**continue**：

 用于循环语句中，用于跳过当前循环中剩余的代码，并开始下一次循环。continue语句可以用在所有的循环结构中，如for、while以及do-while循环中。

例如，我们有一个从1到10的循环，但我们想跳过数字5。我们可以使用continue语句来实现这个需求。

```java
for(int i = 1; i <= 10; i++) {
    if(i == 5) {
        continue;
    }
    System.out.println(i);
}
```

在上述代码中，当i等于5时，continue语句会被执行，然后跳过当前循环，直接开始下一次循环（i等于6的情况）。因此，数字5不会被打印出来。

需要注意的是，continue语句只能在循环中使用，不能在选择结构如if-else中使用。另外，如果是嵌套循环，continue语句只会影响最内层的循环。

## 数组

### 声明数组变量

 数组是一种存储**固定大小的相同类型元素**的数据结构。

数组声明：

1. 数据类型[] 数组名称;  （建议第一种）

   ```java
   int[] myArray;
   ```

2. 数据类型 数组名称[]; 

   ```java
   int myArray[];
   ```

### 创建数组

Java语言使用new操作符来创建数组，最常见的两种方法：

1. 声明数组变量并分配内存空间：

```java
int[] arr = new int[5];
```
在这个例子中，我们创建了一个名为arr的整数数组，它可以存储5个整数。

2. 声明数组变量并初始化：

```java
int[] arr = {1, 2, 3, 4, 5};
```
### 取数组元素

以下标的方式取数组的元素。

### for each 循环

可以使用for-each循环来遍历数组。for-each循环也被称为增强for循环。以下是使用for-each循环遍历数组的基本语法：

```java
for (type var : array) 
{ 
    statements using var;
}
```
在这里，类型是数组的元素类型，变量var用于访问数组的当前元素。

例如，如果我们有一个整数数组intArr，我们可以使用for-each循环来遍历它，如下所示：

```java
int[] intArr = {1, 2, 3, 4, 5};
for (int num : intArr) 
{
    System.out.println(num);
}
```
### 数组拷贝

可以使用多种方法来复制数组。以下是其中的一些方法：

1. 使用循环语句：这是最基本的方法，通过遍历原数组，将每个元素复制到新数组中。

```java
int[] array1 = {23, 43, 55, 12};
int[] array2 = new int[array1.length];
for (int i = 0; i < array1.length; i++) {
    array2[i] = array1[i];
}
```

2. 使用System.arraycopy()方法：这是一个内置方法，可以快速复制数组。

```java
int[] array1 = {23, 43, 55, 12};
int[] array2 = new int[array1.length];
System.arraycopy(array1, 0, array2, 0, array1.length);
```

3. 使用Arrays.copyOf()方法：这也是一个内置方法，可以轻松复制数组。

```java
int[] array1 = {23, 43, 55, 12};
int[] array2 = Arrays.copyOf(array1, array1.length);
```

4. 使用clone()方法：这是一个对象方法，可以复制数组。

```java
int[] array1 = {23, 43, 55, 12};
int[] array2 = array1.clone();
```

### 数组排序

可以使用Arrays类中的sort()方法对数组进行排序。以下是一个示例：

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 创建一个数组
        int[] array = new int[]{9, 5, 3, 7, 2, 8, 4, 1, 6};

        // 使用Arrays类的sort()方法对数组进行排序
        Arrays.sort(array);

        // 打印排序后的数组
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
```
### 多维数组

 二维数组是一个数组的数组，也就是说，它的元素本身也是数组。

```java
public class Test {
   public static void main(String[] args) {
      // 声明并初始化一个二维数组
      int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
      
      // 输出二维数组的元素
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }
}
```
