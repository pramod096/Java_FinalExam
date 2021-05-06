
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ6C1 {

    public static void main(String args[]) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 6:\n");

        FileInputStream f1 = null;

        try {
            f1 = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find the specified file");
        }

        int i;

        try {
            int num1 = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide By Zero");
        }

    }
}
