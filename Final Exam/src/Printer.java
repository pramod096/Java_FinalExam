
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Printer implements OfficeMachine {

    @Override
    public void xerox() {
        System.out.println("The Prints are Ready");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning On the Printer");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Off the Printer");
    }

}
