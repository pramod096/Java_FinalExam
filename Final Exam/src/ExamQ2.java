
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ2 {

    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 2:\n");

        GeometricObject g0 = new Square(4.0);
        GeometricObject g1 = new Square(1.5);
        GeometricObject g2 = new Square(3.6);
        GeometricObject g3 = new Square(6.9);
        GeometricObject g4 = new Square(10.0);

        GeometricObject[] gArray = new GeometricObject[5];

        gArray[0] = g0;
        gArray[1] = g1;
        gArray[2] = g2;
        gArray[3] = g3;
        gArray[4] = g4;

        gArray[3].howToColor();
        for (int i = 0; i < gArray.length; i++) {
            System.out.print("Area of Square " + i + " is: " + gArray[i].area()
                    + " and ");
            gArray[i].howToColor();
        }
    }

}
