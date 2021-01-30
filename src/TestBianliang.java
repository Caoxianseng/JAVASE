public class TestBianliang {
    public static void main(String[] args) {
        //int类型
//        System.out.println(Integer.MAX_VALUE+1);
//        System.out.println(Integer.MIN_VALUE);

        //Long类型
//        long num = 10L;
//        System.out.println(num);
//        //表示100亿
//        long num2 = 10000000000L;
//        System.out.println(num2);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println((double)(Long.MAX_VALUE/Integer.MAX_VALUE));

        //double类型
//        int a = 1;
//        int b = 2;
//        System.out.println(a/b);
//        double a = 1.1;
//        double b = 1.1;
       // System.out.println(a*b);
//        if(a*b == 1.21){//这种不可以进行相等比较,==不可以进行两个小数相等的判断
//            System.out.println("相等");
//        }else{
//            System.out.println("不相等");
//        }

        //正确做法:做差
//        if(a * b - 1.21 < 0.00001
//        && a * b - 1.21 > -0.00001)
//            System.out.println("相等");
//        else
//            System.out.println("不相等");
//


        //char类型,在Java中就是两个字节
//        char a = '中';
//        //char b = a - 32;Java中的类型检查比C中更严格
//        System.out.println(a);

        //字节类型Byte
//        byte a = 127;
//        byte b = -128;

        //short类型
        //用于网络编程


        //boolean类型,不能与整形以及其他类型混用
//        boolean value = true;
//        boolean value2 = false;


            //字符串类型,也是Java中的类
//        String s = "hehe";
//        //通过+进行拼接
//        String b = "haha";
//        System.out.println(s+b);
//        int num= 10;
//        System.out.println(s+num);//是先将int转换为string类型,再进行转换为string类型
//        //输出:My name is "caowen"
//        System.out.println("My name is \"caowen\"");


//
//        {
//            int a = 10;
//        }
//        System.out.println(a);//这里的局部变量作用域是在代码块也就是{}里面,所以出了代码块也就是在作用域外面失效
        //但是成员变量和静态成员变量的作用域就更大.但是受限于访问权限控制

        //变量的命名规则:记住就行也就是运行中产生的效果

       // final int a = 10;
//        a = 20;//不可以进行改变,是因为final不可以进行改变

//        int a = 10;
//        long b = 200_0000_0000L;
//        a = (int)b;//截断,但是自己进行负责,人为保证多半不靠谱
//        System.out.println(a);


        //int 和boolean即使强制转换也不可以
         int a = 10;
         boolean b = true;
         boolean c = false;
//         a = b;
//         b = a;
         c = b;
        //boolean和其他任何类型都不可以进行转换

    }
}
