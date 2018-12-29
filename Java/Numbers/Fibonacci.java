import java.util.Scanner;

/**
 * This program takes an input and returns the fibonacci sequence value to that term.
 * @input int value 0 - infinity
 * @output int value in the fibinocci sequence
 */
public class Fibonacci {

    static int fib(int n) {
        System.out.println("Value of n: " + n);
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        
        int value = fib(n);

        System.out.println("The value of the fibonacci sequence to the " + n + "th place \nis : " + value);

        reader.close();

    }
}