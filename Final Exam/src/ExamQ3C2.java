
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ3C2 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 3:\n");

        Base b = new Base();

        b.base();

        Derived d = new Derived();

        b = d;

        b.base();

        Derived d2 = (Derived) b;

        d2.base();

    }

}
