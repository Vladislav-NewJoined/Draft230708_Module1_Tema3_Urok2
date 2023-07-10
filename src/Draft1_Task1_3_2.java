import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП  Второй пример из интернета
//  взято отсюда: https://question-it.com/questions/11662514/mozhno-li-kak-nibud-ispolzovat-obekt-scanner-v-drugom-klasse
public class Draft1_Task1_3_2 {
    public static void main(String[] args) {
        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
                "из двух целых чисел\n\nРешение: ");
        Scanner scan = new Scanner(System.in);
        AnotherReader anotherReader = new AnotherReader(scan);
        anotherReader.readSomething();

    }
    private static void method(Scanner sc) {

    }
}


//        Конец Примера _ КККККККККККККККК







////        Пример 9 ППППППППППППППППППППППППППППППППППП  Пример из интернета подогнал под себя
////  взято отсюда: https://question-it.com/questions/11662514/mozhno-li-kak-nibud-ispolzovat-obekt-scanner-v-drugom-klasse
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
//
//        Scanner input = new Scanner(System.in);
//        CalledClass cC = new CalledClass();
//
//        cC.testMethod(input);
//    }
//}
//
//
////        Конец Примера 9 КККККККККККККККК







////        Пример 8_2 ППППППППППППППППППППППППППППППППППП  Третий пример из интернета (не работает)
////  взято отсюда: https://stackru.com/questions/39424334/kak-sdelat-obekt-skanera-staticheskim
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
//
//    }
//}
//class spidy {
//
//    Scanner input = new Scanner(System.in);             /*DECLARING SCANNER OBJECT OUTSIDE MAIN METHOD i.e Static method */
//
//
//    public void main(String args[]) {
//
//        System.out.println("Enter a number");
//        int n = input.nextInt();
//    }
//}
////        Конец Примера 8_2 КККККККККККККККК







////        Пример 8 ППППППППППППППППППППППППППППППППППП
////  взято отсюда: https://question-it.com/questions/11662514/mozhno-li-kak-nibud-ispolzovat-obekt-scanner-v-drugom-klasse
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
//
//        Scanner input = new Scanner(System.in);
//        CalledClass cC = new CalledClass();
//
//        cC.testMethod(input);
//    }
//}
//
//
////        Конец Примера 8 КККККККККККККККК








////        Пример 7 ППППППППППППППППППППППППППППППППППП
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
//
//        input(5, 7);
//
//
//    }
//
//
//
//    static Scanner input(int x, int y) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        x = input.nextInt();
//        System.out.print("Введите второе число: ");
//        y = input.nextInt();
//
//        System.out.println(x + ", " + y);
//
//        return input;
//    }
//
////    static Scanner enterInts(Scanner scanner) {
////
////        scanner = new Scanner(System.in);
////            System.out.print("Введите первое число: ");
////        int x = scanner.nextInt();
////            System.out.print("Введите второе число: ");
////        int y = scanner.nextInt();
////
////        return(scanner);
////
////    }
//}
////        Конец Примера 7 КККККККККККККККК








////        Пример 6 ППППППППППППППППППППППППППППППППППП
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
//
//    }
//
//    private static Scanner input = new Scanner(System.in);
//
//    static Scanner enterInts(Scanner scanner) {
//
//        scanner = new Scanner(System.in);
//            System.out.print("Введите первое число: ");
//        int x = scanner.nextInt();
//            System.out.print("Введите второе число: ");
//        int y = scanner.nextInt();
//
//        return(scanner);
//
//    }
//}
////        Конец Примера 6 КККККККККККККККК








////        Пример 5 ППППППППППППППППППППППППППППППППППП
//public class Draft1_Task1_3_2 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n1.\tНапишите метод, который возвращает наибольшее \n" +
//                "из двух целых чисел\n\nРешение: ");
////        int x=0;
////        int y=0;
//        int z = 0;
//        Scanner scanner = null;
//        scanner = enterInts(scanner);
//
////        int sum = x + y;
//        System.out.println(z);
//
//    }
//
//
//    static Scanner enterInts(Scanner scanner) {
//
//        scanner = new Scanner(System.in);
//            System.out.print("Введите первое число: ");
//        int x = scanner.nextInt();
//            System.out.print("Введите второе число: ");
//        int y = scanner.nextInt();
//        int z = x + y;
//
//        return(scanner);
//
//    }
//}
////        Конец Примера 5 КККККККККККККККК








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









