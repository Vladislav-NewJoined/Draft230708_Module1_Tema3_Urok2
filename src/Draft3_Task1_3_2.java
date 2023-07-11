import java.util.Scanner;

public class Draft3_Task1_3_2 {
    public static void main(String[] args) {
        System.out.println("Задание : \n3.\tНапишите метод, который возвращает самую длинную из трех строк" +
                "\n\nРешение: ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первую строку: ");
            String s1 = scanner.nextLine();
            System.out.print("Введите вторую строку: ");
            String s2 = scanner.nextLine();
            System.out.print("Введите третью строку: ");
            String s3 = scanner.nextLine();

        String longest = s1;
        if (s2.length() > longest.length()) {
            longest = s2;
        }
        if (s3.length() > longest.length()) {
            longest = s3;
        }
        System.out.println("Самая длинная строка из трех: " + longest);


    }

}