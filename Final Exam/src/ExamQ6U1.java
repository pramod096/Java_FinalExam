
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Pramod Reddy Gonegari
 */
public class ExamQ6U1 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 6:\n");

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Length of the array is less than the specified index");
        }

        try {
            FileReader f1 = null;

            f1.read();
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
