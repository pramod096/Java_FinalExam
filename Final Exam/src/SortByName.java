
/**
 *
 * @author Pramod Reddy Gonegari
 */
import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getEmpName().compareTo(e2.getEmpName()) < 0) {
            return -1;
        } else if (e1.getEmpName().compareTo(e2.getEmpName()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
