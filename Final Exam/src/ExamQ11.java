
/**
 *
 * @author Pramod Reddy Gonegari
 */

/*If two objects are the same as per the equals(Object) method, then if we call
the hashCode() method on each of the two objects, 
it must provide the same integer result.*/
public class ExamQ11 {

    public static void main(String[] args) {
        
        System.out.println("Pramod Reddy Gonegari");
        System.out.println("Answer for Question 11:\n");
        
        /*Initializing two String Objects which have the same value.*/
        String a = "Andrew";
        String b = "Andrew";

        /*Checking the equality of objects using equals() method and also
        hash values, since the objects are equal their HashValues will also
        be equal*/
        if (a.equals(b)) {
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " " + a.hashCode() + " & " + b.hashCode());

        }

        /*Initializing two String Objects which have different values.*/
        String c = "Maria";
        String d = "Julie";

        /*Checking the equality of objects using equals() method and also
        hash values, as the objects are different their HasValues will also
        be different*/
        if (!c.equals(d)) {
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " " + c.hashCode() + " & " + d.hashCode());

        }
    }
}
