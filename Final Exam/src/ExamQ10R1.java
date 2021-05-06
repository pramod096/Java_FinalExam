
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ10R1 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 10:\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input number: ");

        int c = sc.nextInt();

        countDown(c);
    }

    public static void countDown(int c) {

        if (c == 0) {
            System.out.println("Recursion Ended");
        } else {
            System.out.println(c);
            countDown(c - 1);
        }
    }
}
