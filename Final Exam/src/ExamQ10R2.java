
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ10R2 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 10:\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input number: ");

        int input = sc.nextInt();

        infiniteRecursion(input);
    }

    public static void infiniteRecursion(int i) {

        System.out.println(i + ": Infinite Recursion");

        if (i != 0) {
            i++;
            infiniteRecursion(i);
        }

    }
}
