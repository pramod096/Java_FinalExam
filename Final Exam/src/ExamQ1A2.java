
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ1A2 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 1:\n");

        MaryvilleClinic mc = new MaryvilleClinic(150, 200);

        System.out.println("Available Beds in MaryvilleClinic are: " + mc.availableBeds());

        System.out.println("Patients admitted due to accidents are: " + mc.numberOfAccidents());
    }

}
