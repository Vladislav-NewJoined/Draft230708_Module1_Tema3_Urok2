import java.util.Scanner;

public class AnotherReader {

    Scanner scan;

    public AnotherReader(Scanner scan) {
        this.scan = scan;
}

    public void readSomething(){
        String line = scan.nextLine();
        // Do something
        System.out.println(line + " удалась!");

    }
}