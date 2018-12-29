import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Morgage_Calculator
 */
public class Morgage_Calculator {

    static double calculateTotal(double loanAmount, double nYears, double intrestPercenage) {
        double total = loanAmount * (1 + (nYears * intrestPercenage));
        return BigDecimal.valueOf(total)
        .setScale(2, RoundingMode.CEILING)
        .doubleValue();
    }

    public static void main(String[] args) {
        double nYears;
        double loanAmount;
        double intrestPercenage;
        double totalAmount;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter how much the loan is: ");
        loanAmount = in.nextDouble();
        System.out.print("Enter how many years the loan is for: ");
        nYears = in.nextDouble();
        System.out.print("Enter loan percentage rate (0 - 100): ");
        intrestPercenage = in.nextDouble();
        intrestPercenage = intrestPercenage / 100.0;

        totalAmount = calculateTotal(loanAmount, nYears, intrestPercenage);

        System.out.println("After intrest, your total comes to: " + totalAmount);
    }
}