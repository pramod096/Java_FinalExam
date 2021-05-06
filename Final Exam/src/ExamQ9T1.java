
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ9T1 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 9:\n");
        
        Throwable t = new Throwable();

        int limit = 21;
        int age;
        System.out.print("Enter Age: ");
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();
        try {
            if (age < limit) {
                throw t;
            } else {
                System.out.println("Welcome!");
            }
        } catch (Throwable th) {
            System.out.println("Age restriction, cannot allow");
        }

        {
            System.out.println();
        }
    }

}
