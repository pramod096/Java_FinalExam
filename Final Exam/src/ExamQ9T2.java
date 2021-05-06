
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ9T2 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 9:\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source File Name: ");

        String file = sc.next();
        try {
            exception(file);
        } catch (FileNotFoundException f) {
            System.out.println("Cannot find File");
        }
    }

    public static void exception(String file) throws FileNotFoundException {
        String fileName1 = "myfile.txt";

        if (!fileName1.equals(file)) {
            throw new FileNotFoundException();
        } else {
            System.out.println("File Found");
        }
    }
}
