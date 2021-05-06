
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class ExamQ1A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 1:\n");

        Agriculture a1 = new Agriculture("Agriculture", 2400, 5.5);

        System.out.println("Annual Income: $" + a1.annualIncome());
        System.out.println("Income After Tax: $" + a1.incomeAfterTax());
    }

}
