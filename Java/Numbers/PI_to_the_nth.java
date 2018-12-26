import java.util.Scanner;
// This Program take a number and returns that place in pi (upto 15)
// Ex: Input 3 - Output 4
// Ex: Input 1 - Output 3
/**
 * PI_to_the_nth
 */
public class PI_to_the_nth {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number between 1 and 15: ");

        int n = reader.nextInt(); // Scans the next token of the input as an int.
        while(n > 15 || n < 1) {
            System.out.println("Please enter a number between 1 - 15");
            n = reader.nextInt(); // Scans the next token of the input as an int.
        }
        double nVal = Math.pow(10, n);

        double piValue = (double) Math.round(Math.PI * nVal) / nVal;
        System.out.println("This is the value of PI to the " + n + "th value is : " + piValue);
        reader.close();
    }
}