package ex_16_ARRAYS;
// ARRAY WITH LEFT TRIANGLE
import java.util.Scanner;

public class Lab165_ARRAY_LEFT_TRI {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num e.g = 3");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
