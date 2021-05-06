
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ7 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 7:\n");

        int[] arr = new int[100];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index");
        int index = sc.nextInt();

        System.out.print("The integer at the given index is: ");

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }

}
