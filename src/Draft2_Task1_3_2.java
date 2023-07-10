import java.util.Scanner;

public class Draft2_Task1_3_2 {
    public static void main(String[] args) {
        System.out.println("Задание : \n2.\tНапишите метод, который возвращает наибольшее из двух " +
                "дробных чисел\n\nРешение: ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое дробное число (с разделителем 'запятая'): ");
            double x = scanner.nextDouble();
            System.out.print("Введите второе дробное число (с разделителем 'запятая'): ");
            double y = scanner.nextDouble();

            double max = findMax(x, y);
//            if (x>y) {
//                max = x;
//            } else {
//                max = y;
//            }
//            System.out.println("Наибольшее число: " + max);

            double maximum = printMax(max);
    }

    static double  findMax(double a, double b) {
        double maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        return maximum;
    }

    static double printMax(double max) {
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