
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double diameter) {
        super(diameter);
    }

    public double area() {
        return (Math.PI * Math.pow(diameter / 2.0, 2.0));
    }

    @Override
    public int compareTo(ComparableCircle cc) {
        if (this.area() == cc.area()) {
            return 0;
        } else if (this.area() > cc.area()) {
            return 1;
        } else {
            return -1;
        }
    }

}
