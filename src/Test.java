public class Test {
    //定义一个方法,用来实现两个数的交换
    public static void swap(int[] arrays, int i, int j) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

    //定义一个方法用来实现打印
    public static void print(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "    ");
        }
    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static int[] bubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {//外层循环,用来控制外层循环次数
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1])
                    swap(arrays, j, j + 1);
            }
        }
        return arrays;
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean ifUpsort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1])
                    return false;
            }
        }
        return true;
    }

    //给定一个有序整型数组, 实现二分查找
    public static int forWhere(int[] arrays, int num) {
        int left = 0;
        int right = arrays.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (num == arrays[mid]) {
                return mid;
            } else if (num < arrays[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
    public static int[] copyOf(int[] arrays, int length) {
        int[] newarray = new int[arrays.length];
        for (int i = 0; i < length; i++) {
            newarray[i] = arrays[i];
        }
        return newarray;
    }

    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
    // 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String toString(int[] arrays) {
        String ret = "\"";
        ret += "[";
        for (int i = 0; i < arrays.length; i++) {
            if (i < arrays.length - 1) {
                ret += arrays[i] + ",";
            } else if (i == arrays.length - 1) {
                ret += arrays[i] + "]";
            }
        }
        ret += "\"";
        return ret;

    }

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double result = (double) sum / array.length;
        return result;
    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static int[] transform(int[] array) {
        int[] help = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            help[i] = 2 * array[i];
        }
        return help;
    }

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "    ");
            if (i != 0 && i % 9 == 0) {
                System.out.println();
            }
        }
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static int[] assignment() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++)
            array[i] = i + 1;
        return array;
    }

    //求斐波那契数列的第n项。(迭代实现)
    public static int func(int n) {
        int first = 1;
        int second = 1;
        int result = 0;
        if (n == 1 || n == 2)
            return 1;
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    //求1！+2！+3！+4！+........+n!的和
    public static int jiecheng(int n) {//用来求n的阶乘
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int jiechenghe(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += jiecheng(i);
        }
        return sum;
    }

    //奇数位于偶数之前,
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
    public static void sortByGiOrOu(int[] arr,int n) {
        int i;
        int j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] % 2 != 0) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }

        }
    }
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int m,int n){
        return m > n ? m : n;
    }
    public static int max3(int m,int n,int l){
        return l > Test.max2(m,n) ? l:Test.max2(m,n);
    }

    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，
    // 以及两个小数和一个整数的大小关系
    public static int MAX1(int m, int n){
        return m > n ? m : n;
    }
    public static double MAX1(double m,double n){
        return m > n? m : n;
    }

    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int forSum(int m,int n){
        return m + n;
    }
    public static double forSum(double m,double n,double l){
        return m + n + l;
    }

    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
    public static int forFirst(int[] arr){
        int i = 0;
        int j = 0;
        int count;
        for(i = 0;i < arr.length; i++){
            count = 0;
            for(j = 0;j < arr.length; j++){
                if(arr[i] == arr[j])
                    count++;

            }if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    //定义一个函数,用来实现对于打字的实现



    //主函数实现对各个数据的检验
        public static void main (String[]args){

        int[] array = new int[]{1,1,2,2,5,5,9,9,6,6,8,8,4,7,7,3,3};
        if(Test.forFirst(array) != -1)
            System.out.println(Test.forFirst(array));
        else
            System.out.println("没有出现一次的数");
//            System.out.println(Test.forSum(2,5));
//            System.out.println(Test.forSum(4.4,6.6,5.5));


//            System.out.println(Test.MAX1(4,9));
//            System.out.println(Test.MAX1(4.4,9.8));
//    int[] array = new int[]{1,5,9,6,3,4,2,5,6,77,4,4};
//    Test.sortByGiOrOu(array,array.length);
//
//    Test.print(array);

            //System.out.println(Test.jiecheng(5));


            //System.out.println(Test.func(6));


//    int[] array = Test.assignment();
//    Test.printArray(array);
//        System.out.println("之前为:");
//        Test.print(array);
//        System.out.println();
//        System.out.println("转换为:");
//        int[] newarray = Test.transform(array);
//        Test.print(newarray);
//        System.out.println();
//        System.out.println("和为:"+ Test.sum(array));

//    Test.print(array);
//        System.out.println();
//        System.out.println(Test.toString(array));
//        System.out.println("之前的数组为:");
//        Test.print(array);
//        System.out.println();
//        int[] newarray = copyOf(array,array.length);
//        System.out.println("拷贝的数组为:");
//        Test.print(newarray);


//        if(Test.forWhere(array,5) != -1){
//            System.out.println();
//            System.out.println("位置在第" + (Test.forWhere(array,5) + 1 )+ "个");}
//        else{
//            System.out.println();
//            System.out.println("该数组中没有这个数");}

//    if(Test.ifUpsort(array))
//        System.out.println("该数组为升序");
//    else
//        System.out.println("该数组不是升序");
//        System.out.println("排序前:");
            //   Test.print(array);
//    Test.bubbleSort(array);
//        System.out.println();
//    System.out.println("排序后:");
//    Test.print(array);
        }
    }

