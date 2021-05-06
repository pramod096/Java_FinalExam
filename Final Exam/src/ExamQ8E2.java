
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ8E2 {

    public static void main(String[] args) throws EOFException, FileNotFoundException, IOException {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 8:\n");

        File file = new File("numbers.txt");
        DataInputStream dataInputStream = null;

        dataInputStream = new DataInputStream(new FileInputStream(file));
        while (true) {
            dataInputStream.readInt();
        }

    }

}
