
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Square extends GeometricObject implements Colorable {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double area() {
        return Math.pow(sideLength, 2.0);
    }

}
