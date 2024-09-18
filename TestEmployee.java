import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class TestEmployee {

    public static void main(String [] args) {
        Employee e1 = new Employee(1,"John","Doe",4500);

        Employee e2 = new Employee(2,"James","Doe",5000);

        Currency currency = Currency.getInstance(Locale.CANADA);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);

        System.out.println("John's annual salary:                   " + currencyFormatter.format(e1.getAnnualSalary()));
        System.out.println("James' annual salary:                   " + currencyFormatter.format(e2.getAnnualSalary()));
        System.out.println("John's new salary (After % increase):   " + currencyFormatter.format(e1.raiseSalary(20)));
        System.out.println("James' new salary (After % increase):   " + currencyFormatter.format(e2.raiseSalary(20)));
    }
}