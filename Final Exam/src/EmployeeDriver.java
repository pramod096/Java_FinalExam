
/**
 *
 * @author Pramod Reddy Gonegari
 */
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {

    public static void main(String[] args) {
        
        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 12:\n");

        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee(9847, "Sruthi", 96000));
        emps.add(new Employee(5674, "Raj", 64500));
        emps.add(new Employee(3647, "Nari", 43400));
        emps.add(new Employee(1839, "Vivek", 33000));
        emps.add(new Employee(8746, "Ammu", 74500));

        System.out.println("Displaying the employees List :");

        for (Employee emp : emps) {
            System.out.println(emp);
        }

        Collections.sort(emps);
        System.out.println("\n\nAfter Sorting by empId displaying the employees List :");

        for (Employee emp : emps) {
            System.out.println(emp);
        }

        Collections.sort(emps, new SortBySalary());
        System.out.println("\n\nAfter Sorting by salary displaying the employees List :");

        for (Employee emp : emps) {
            System.out.println(emp);
        }

        Collections.sort(emps, new SortByName());
        System.out.println("\n\nAfter Sorting by employee name displaying the employees List :");

        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }

}
