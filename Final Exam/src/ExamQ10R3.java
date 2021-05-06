
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ10R3 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 10:\n");

        ArrayList<Integer> search = new ArrayList<>();
        search.add(10);
        search.add(20);
        search.add(30);
        search.add(40);
        search.add(50);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input number: ");

        int input = sc.nextInt();

        int index = recursionElement(search, 0, search.size() - 1, input);

        if (index != -1) {
            System.out.println("The Element is at index: " + index);
        } else {
            System.out.println("Element Not Found");
        }
    }

    public static int recursionElement(ArrayList<Integer> search, int l, int r, int x) {

        if (r < l) {
            return -1;
        }
        if (search.get(l) == x) {
            return l;
        }
        if (search.get(r) == x) {
            return r;
        }

        return recursionElement(search, l + 1, r - 1, x);

    }
}
