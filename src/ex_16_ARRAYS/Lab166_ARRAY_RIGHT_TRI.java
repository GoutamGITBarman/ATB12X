package ex_16_ARRAYS;
// ARRAY WITH RIGHT TRIANGLE
import java.util.Scanner;

public class Lab166_ARRAY_RIGHT_TRI {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        // *
        // **
        // ***
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num e.g = 3");
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }




    }
}
