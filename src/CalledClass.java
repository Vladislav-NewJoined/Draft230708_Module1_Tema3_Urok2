import java.util.Scanner;

public class CalledClass {
    public void testMethod(Scanner x) {
        System.out.println("Enter anything: Переменная x");
        String myString = x.next();
        System.out.println(myString);
    }
}