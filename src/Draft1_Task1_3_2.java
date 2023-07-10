import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП
public class Draft1_Task1_3_2 {
    public static void main(String[] args) {
        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
                "из двух целых чисел\n\nРешение: ");
        int x=0;
        int y=0;
        enterInts();
        int sum = x + y;
        System.out.println(sum);

    }

    static void enterInts() {

        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
            System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

    }
}
//        Конец Примера _ КККККККККККККККК









////        Пример 4 ППППППППППППППППППППППППППППППППППП
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
////            Scanner scanner = new Scanner(System.in);
////            System.out.print("Введите первое число: ");
////            int x = scanner.nextInt();
////            System.out.print("Введите второе число: ");
////            int y = scanner.nextInt();
//
////            Scanner scanner = new Scanner(System.in);
////            System.out.print("Введите первое число: ");
//            int x=0;
//            int y=0;
//            enterInts(x, y);
//
//
//
////            System.out.print("Введите второе число: ");
//
//
////            int max = findMax(x, y);
////            if (x>y) {
////                max = x;
////            } else {
////                max = y;
////            }
////            System.out.println("Наибольшее число: " + max);
//
////            int maximum = printMax(max);
//    }
//
//    static int  findMax(int a, int b) {
//
//        int maximum;
//        if (a > b) {
//            maximum = a;
//        } else {
//            maximum = b;
//        }
//        return maximum;
//    }
//
//    static int printMax(int max) {
//        System.out.println("Наибольшее число: " + max);
//        return max;
//    }
//
//    static int enterInts(int x, int y) {
////        input1 = new Scanner(System.in).nextInt();
////        int x;
////        int y;
//
//        Scanner scanner = new Scanner(System.in);
//            System.out.print("Введите первое число: ");
//            x = scanner.nextInt();
//            System.out.print("Введите второе число: ");
//            y = scanner.nextInt();
//
//        return enterInts(x, y);
//    }
//}
////        Конец Примера 4 КККККККККККККККК









////        Пример 3 ППППППППППППППППППППППППППППППППППП
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
////            Scanner scanner = new Scanner(System.in);
////            System.out.print("Введите первое число: ");
////            int x = scanner.nextInt();
////            System.out.print("Введите второе число: ");
////            int y = scanner.nextInt();
//
////            Scanner scanner = new Scanner(System.in);
////            System.out.print("Введите первое число: ");
//            int x=0;
//            int y=0;
//            enterInts(x, y);
//
////            System.out.print("Введите второе число: ");
//
//
//            int max = findMax(x, y);
////            if (x>y) {
////                max = x;
////            } else {
////                max = y;
////            }
////            System.out.println("Наибольшее число: " + max);
//
//            int maximum = printMax(max);
//    }
//
//    static int  findMax(int a, int b) {
//
//        int maximum;
//        if (a > b) {
//            maximum = a;
//        } else {
//            maximum = b;
//        }
//        return maximum;
//    }
//
//    static int printMax(int max) {
//        System.out.println("Наибольшее число: " + max);
//        return max;
//    }
//
//    static void enterInts(int x, int y) {
////        input1 = new Scanner(System.in).nextInt();
////        int x;
////        int y;
//
//        Scanner scanner = new Scanner(System.in);
//            System.out.print("Введите первое число: ");
//            x = scanner.nextInt();
//            System.out.print("Введите второе число: ");
//            y = scanner.nextInt();
//
//        return;
//    }
//}
////        Конец Примера 3 КККККККККККККККК









////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
////            Scanner scanner = new Scanner(System.in);
////            System.out.print("Введите первое число: ");
////            int x = scanner.nextInt();
////            System.out.print("Введите второе число: ");
////            int y = scanner.nextInt();
//
////            Scanner scanner = new Scanner(System.in);
//            System.out.print("Введите первое число: ");
////            int x = scannerInt(x);
//            System.out.print("Введите второе число: ");
////            int y = scannerInt(y);
//
//
//            int max = findMax(x, y);
////            if (x>y) {
////                max = x;
////            } else {
////                max = y;
////            }
////            System.out.println("Наибольшее число: " + max);
//
//            int maximum = printMax(max);
//    }
//
//    static int  findMax(int a, int b) {
//        int maximum;
//        if (a > b) {
//            maximum = a;
//        } else {
//            maximum = b;
//        }
//        return maximum;
//    }
//
//    static int printMax(int max) {
//        System.out.println("Наибольшее число: " + max);
//        return max;
//    }
//
//    static void scannerInt(int input1, int input2) {
//        input1 = new Scanner(System.in).nextInt();
//        input2 = new Scanner(System.in).nextInt();
//
//        return;
//    }
//}
////        Конец Примера 2 КККККККККККККККК









////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Введите первое число: ");
//            int x = scanner.nextInt();
//            System.out.print("Введите второе число: ");
//            int y = scanner.nextInt();
//
//            int max = findMax(x, y);
////            if (x>y) {
////                max = x;
////            } else {
////                max = y;
////            }
////            System.out.println("Наибольшее число: " + max);
//
//            int maximum = printMax(max);
//    }
//
//    static int  findMax(int a, int b) {
//        int maximum;
//        if (a > b) {
//            maximum = a;
//        } else {
//            maximum = b;
//        }
//        return maximum;
//    }
//
//    static int printMax(int max) {
//        System.out.println("Наибольшее число: " + max);
//        return max;
//    }
//
////    static Scanner scanning(Scanner scanner) {
////        Scanner scanning = new Scanner(System.in);
////        System.out.print("Введите первое число: ");
////        int x = scanning.nextInt();
////        System.out.print("Введите второе число: ");
////        int y = scanning.nextInt();
////
////        return scanning;
////    }
//}
////        Конец Примера 1 КККККККККККККККК









