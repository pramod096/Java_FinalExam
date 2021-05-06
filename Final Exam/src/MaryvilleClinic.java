
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class MaryvilleClinic extends Hospital {

    private int noOfPatients;
    private int noOfBeds;

    public MaryvilleClinic(int noOfPatients, int noOfBeds) {
        this.noOfPatients = noOfPatients;
        this.noOfBeds = noOfBeds;
    }

    @Override
    public int availableBeds() {
        return noOfBeds - noOfPatients;
    }

    @Override
    public int numberOfAccidents() {
        return (int) (noOfPatients * 0.4);
    }

}
