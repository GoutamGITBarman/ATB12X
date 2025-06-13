package ex_01_Java_Basics;
import java.util.Arrays;
import java.util.Scanner;
public class TaskFactorial001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        if( n == 0){
            fact = 1;
        }

        if(n > Integer.MAX_VALUE){ // if(n > 2147483647){
            System.out.println("I can't handle the number > Max of Int");
        }

        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }

        System.out.println(fact);



    }

    public static String taskfact() {
        String[] result = new String[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: "); // Added a prompt for the user
        int n = scanner.nextInt();
        long fact = 1; // Changed 'fact' to long to handle larger factorials

        // Handle negative input
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        // Handle n = 0 explicitly (though the loop handles it too)
        else if (n == 0) {
            fact = 1;
        }
        // Handle numbers too large for 'long'
        // Note: Factorials grow very quickly. Even 'long' has limits.
        // For n > ~20, 'long' will overflow.
        else if (n > 20) { // A practical limit for 'long' factorial
            System.out.println("The number is too large to calculate its factorial with standard data types without overflow.");
            System.out.println("Factorials grow extremely fast! For n > 20, the result exceeds what a 'long' can hold.");
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of " + n + " is: " + fact);
        }

        scanner.close(); // Close the scanner when you're done

            result[1] = taskfact();

        return Arrays.toString(result);


    }



}
