
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ8E1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 8:\n");

        FileInputStream f1 = null;
        f1 = new FileInputStream("myfile.txt");
        int j;

        while ((j = f1.read()) != -1) {
            System.out.print((char) j);
        }

        System.out.println();

        f1.close();
    }

}
