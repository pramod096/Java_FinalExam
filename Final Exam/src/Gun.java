
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Gun implements Weapons, Enemy {

    @Override
    public void aim() {
        System.out.println("Get to the Position");
    }

    @Override
    public void reload() {
        System.out.println("Out of Ammo! ReLoad");
    }

    @Override
    public void fire() {
        System.out.println("Open Fire!");
    }

}
