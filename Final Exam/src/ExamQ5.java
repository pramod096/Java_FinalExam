
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ5 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 5:\n");

        ComparableCircle cc1 = new ComparableCircle(20.0);
        ComparableCircle cc2 = new ComparableCircle(50.0);

        if (cc2.compareTo(cc1) < 0) {
            System.out.println("Area of cc1 is larger");
        } else if (cc2.compareTo(cc1) > 0) {
            System.out.println("Area of cc2 is larger");
        } else {
            System.out.println("Area of two circles is equal");
        }
    }

}
