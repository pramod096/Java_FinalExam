
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Emp Id: " + empId + ", Emp Name: " + empName + ", Emp Salary: "
                + empSalary;
    }

    @Override
    public int compareTo(Employee other) {
        if (this.empId < other.getEmpId()) {
            return -1;
        } else if (this.empId > other.getEmpId()) {
            return 1;
        } else {
            return 0;
        }
    }

}
