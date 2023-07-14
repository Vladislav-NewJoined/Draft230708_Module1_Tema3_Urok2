import java.util.Scanner;

//  Пример _ ППППППППППППППППППППППППППППППППППП
//  Заборчиком здесь: Module1_Tema2_Urok7   видео мин 11 33
public class Draft_Task1_3_2_6 {
    public static void main(String[] args) {
        System.out.println("Задание: \n6.  Напишите метод, который возвращает входящую строку, " +
                "делая ее ЗаБоРчИкОм\n\nРешение: ");

        getConvertedString();
        System.out.println(); //  перенос строки
    }

    static void getConvertedString() {  //  Создаем метод для ввода строки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputStr = scanner.nextLine();
        char chars[] = inputStr.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        System.out.print("Преобразованная строка: ");
        for (int i = 0; i < size; i++) {
            System.out.print(chars[i]);
        }
        return;
    }
}
//        Конец Примера _ КККККККККККККККК


////  Пример 2 ППППППППППППППППППППППППППППППППППП
////  Заборчиком здесь: Module1_Tema2_Urok7   видео мин 11 33
//public class Draft_Task1_3_2_6 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Напишите метод, который возвращает входящую строку, " +
//                "делая ее ЗаБоРчИкОм\n\nРешение: ");
//        String inputStr = readString();
//        char chars[] = inputStr.toCharArray();
//        int size = chars.length;
//        for (int i = 0; i < size; i++) {
//            if (i % 2 == 0) {
//                chars[i] = Character.toUpperCase(chars[i]);
//            } else {
//                chars[i] = Character.toLowerCase(chars[i]);
//            }
//        }
//        System.out.print("Преобразованная строка: ");
//        for (int i = 0; i < size; i++) {
//            System.out.print(chars[i]);
//        }
//    }
//    String inputStr = readString();
//    static String readString() {  //  Создаем метод для ввода строки
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String inputStr = scanner.nextLine();
//
//        return inputStr;
//    }
//}
////        Конец Примера 2 КККККККККККККККК


////  Пример 1 ППППППППППППППППППППППППППППППППППП Нужно создать еще два отдельных метода
////  Заборчиком здесь: Module1_Tema2_Urok7   видео мин 11 33
//public class Draft_Task1_3_2_6 {
//    public static void main(String[] args) {
//        System.out.println("Задание: \n6.  Напишите метод, который возвращает входящую строку, " +
//                "делая ее ЗаБоРчИкОм\n\nРешение: ");
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Введите строку: ");
////        String inputStr = scanner.nextLine();
//        String inputStr = readString();
//        char chars[] = inputStr.toCharArray();
//        int size = chars.length;
//        for (int i = 0; i < size; i++) {
//            if (i % 2 == 0) {
//                chars[i] = Character.toUpperCase(chars[i]);
//            } else {
//                chars[i] = Character.toLowerCase(chars[i]);
//            }
//        }
//        System.out.print("Преобразованная строка: ");
//        for (int i = 0; i < size; i++) {
//            System.out.print(chars[i]);
//        }
//    }
//    static String readString() {  //  Создаем метод для ввода строки
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String inputStr = scanner.nextLine();
//
//        return inputStr;
//    }
//
//    static int findMax(int a, int b) {  //  Создаем метод для преобразования строки
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
////        System.out.println("Наибольшее число: " + max);
//        return max;
//    }
//}
////        Конец Примера 1 КККККККККККККККК








