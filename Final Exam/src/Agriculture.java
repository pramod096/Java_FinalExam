
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Agriculture extends Occupation {

    private String occupationName;
    private double monthlyIncome;
    private double tax;

    public Agriculture(String occupationName, double income, double tax) {
        this.occupationName = occupationName;
        this.monthlyIncome = income;
        this.tax = tax;
    }

    @Override
    public double annualIncome() {
        return monthlyIncome * 12;
    }

    public double incomeAfterTax() {
        return monthlyIncome - (monthlyIncome * (tax / 100.00));
    }

}
