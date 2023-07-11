import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП Работает, но не в main
public class AnotherReader {

    Scanner scan;

    public AnotherReader(Scanner scan) {
        this.scan = scan;
}
    int x = 0;
    int y = 0;
    public void readSomething(){
        x = scan.nextInt();
        y = scan.nextInt();

        // Do something
        System.out.println(x + y);

    }
}
//        Конец Примера _ КККККККККККККККК






////        Пример 2 ППППППППППППППППППППППППППППППППППП
//public class AnotherReader {
//
//    Scanner scan;
//
//    public AnotherReader(Scanner scan) {
//        this.scan = scan;
//}
//    int x = 0;
//    int y = 0;
//    public void readSomething(){
//        x = scan.nextInt();
//        y = scan.nextInt();
//
//        // Do something
//        System.out.println(x + y);
//
//    }
//}
////        Конец Примера 2 КККККККККККККККК






////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class AnotherReader {
//
//    Scanner scan;
//
//    public AnotherReader(Scanner scan) {
//        this.scan = scan;
//}
//
//    public void readSomething(){
//        String line = scan.nextLine();
//        // Do something
//        System.out.println(line + " удалась!");
//
//    }
//}
////        Конец Примера 1 КККККККККККККККК






