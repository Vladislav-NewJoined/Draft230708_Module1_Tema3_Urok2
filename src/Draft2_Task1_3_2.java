import java.util.Scanner;

public class Draft2_Task1_3_2 {
    public static void main(String[] args) {
        System.out.println("Задание : \n2.\tНапишите метод, который возвращает наиболее из двух " +
                "дробных чисел\n\nРешение: ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int x = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int y = scanner.nextInt();

            int max = findMax(x, y);
//            if (x>y) {
//                max = x;
//            } else {
//                max = y;
//            }
//            System.out.println("Наибольшее число: " + max);

            int maximum = printMax(max);
    }

    static int  findMax(int a, int b) {
        int maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        return maximum;
    }

    static int printMax(int max) {
        System.out.println("Наибольшее число: " + max);
        return max;
    }

//    static Scanner scanning(Scanner scanner) {
//        Scanner scanning = new Scanner(System.in);
//        System.out.print("Введите первое число: ");
//        int x = scanning.nextInt();
//        System.out.print("Введите второе число: ");
//        int y = scanning.nextInt();
//
//        return scanning;
//    }
}