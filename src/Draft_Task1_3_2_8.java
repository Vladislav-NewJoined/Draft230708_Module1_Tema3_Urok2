import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


////        Пример _ ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!!!!!!!!!!!!!!
//public class Draft_Task1_3_2_8 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n8.  Напишите метод, который принимает три массива, а возвращает массив, " +
//                "сумма элементов которого самая большая\n\nРешение: ");
////        System.out.println("Объявляем и инициализируем три массива целых чисел: a, b, c.");
////
////        int a1 = 0;
////        int a2 = 1;
////        int a3 = 2;
////        int a4 = 3;
////        int a5 = 4;
////        int[] a = new int[] { a1, a2, a3, a4, a5 };
////
////        int b1 = 5;
////        int b2 = 6;
////        int b3 = 7;
////        int b4 = 8;
////        int b5 = 9;
////        int[] b = new int[] { b1, b2, b3, b4, b5 };
////
////        int c1 = 10;
////        int c2 = 11;
////        int c3 = 12;
////        int c4 = 13;
////        int c5 = 14;
////        int[] c = new int[] { c1, c2, c3, c4, c5 };
////
////        int sum1 = 0;
////        for (int i = 0; i < a.length; i++) {
////            sum1 = sum1 + a[i];
////        }
////        System.out.println("a: " + Arrays.toString(a));
//////        System.out.println(sum1);
////
////        int sum2 = 0;
////        for (int i = 0; i < b.length; i++) {
////            sum2 = sum2 + b[i];
////        }
////        System.out.println("b: " + Arrays.toString(b));
//////        System.out.println(sum2);
////
////        int sum3 = 0;
////        for (int i = 0; i < c.length; i++) {
////            sum3 = sum3 + c[i];
////        }
////        System.out.println("c: " + Arrays.toString(c));
//////        System.out.println(sum3);
////
////        int maxSum = sum1;
////        String maxArray = "a";
////
////        if (sum2 > maxSum) {
////            maxSum = sum2;
////            maxArray = "b";
////        }
////        if (sum3 > maxSum) {
////            maxSum = sum3;
////            maxArray = "c";
////        }
////        System.out.println("Массив с максимальной суммой: " + maxArray + ". Сумма его элементов: " + maxSum);
//
//    }
//
//    static String getMaxSumArray(String maxArray, int maxSum) {
//        System.out.println("Объявляем и инициализируем три массива целых чисел: a, b, c.");
//
//        int a1 = 0;
//        int a2 = 1;
//        int a3 = 2;
//        int a4 = 3;
//        int a5 = 4;
//        int[] a = new int[] { a1, a2, a3, a4, a5 };
//
//        int b1 = 5;
//        int b2 = 6;
//        int b3 = 7;
//        int b4 = 8;
//        int b5 = 9;
//        int[] b = new int[] { b1, b2, b3, b4, b5 };
//
//        int c1 = 10;
//        int c2 = 11;
//        int c3 = 12;
//        int c4 = 13;
//        int c5 = 14;
//        int[] c = new int[] { c1, c2, c3, c4, c5 };
//
//        int sum1 = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum1 = sum1 + a[i];
//        }
//        System.out.println("a: " + Arrays.toString(a));
////        System.out.println(sum1);
//
//        int sum2 = 0;
//        for (int i = 0; i < b.length; i++) {
//            sum2 = sum2 + b[i];
//        }
//        System.out.println("b: " + Arrays.toString(b));
////        System.out.println(sum2);
//
//        int sum3 = 0;
//        for (int i = 0; i < c.length; i++) {
//            sum3 = sum3 + c[i];
//        }
//        System.out.println("c: " + Arrays.toString(c));
////        System.out.println(sum3);
//
//        maxSum = sum1;
//        maxArray = "a";
//
//        if (sum2 > maxSum) {
//            maxSum = sum2;
//            maxArray = "b";
//        }
//        if (sum3 > maxSum) {
//            maxSum = sum3;
//            maxArray = "c";
//        }
//        System.out.println("Массив с максимальной суммой: " + maxArray + ". Сумма его элементов: " + maxSum);
//
//        return (maxArray, maxSum);
//    }
//}
////        Конец Примера _ КККККККККККККККК





//        Пример 1 ППППППППППППППППППППППППППППППППППП СДЕЛАН ОКОНЧАТЕЛЬНО, ОТПРАВЛЕН В ЭТОМ ВИДЕ !!!!!!!!!!!!!!!!!!
public class Draft_Task1_3_2_8 {
    public static void main(String[] args) {
        System.out.println("Задание: \n8.  Напишите метод, который принимает три массива, а возвращает массив, " +
                "сумма элементов которого самая большая\n\nРешение: ");
        B obj=new B();  //  obj of class B with myfun() method
        String returned[]=obj.myfun().split(",");
        //  splitting integer and string values with "," and storing them in array
        int b1=Integer.parseInt(returned[0]); //  converting first value in array to integer.
        System.out.println(returned[0]); //  printing integer
        System.out.println(returned[1]); //  printing String



    }



}

class B {
    public String myfun() {
        int a=2;           //  Integer .. you could use scanner or pass parameters ..i have simply assigned
        String b="hi";     //  String
        return Integer.toString(a)+","+b; // returnig string and int with "," in middle
    }
}

//        Конец Примера 1 КККККККККККККККК





