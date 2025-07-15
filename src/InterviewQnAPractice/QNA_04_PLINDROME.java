package InterviewQnAPractice;

import java.util.Scanner;

//A palindrome is a word or phrase that reads the same forward and backward — like "madam", "racecar", or "A man, a plan;
// a canal: Panama" (if you ignore spaces, punctuation, and capitalization).
//Create a program that checks whether a given string is a palindrome. A palindrome is a word or phrase that reads the same;
// backward as forward (ignoring spaces, punctuation, and capitalization). Use an if-else statement to determine;
// if the string is a palindrome; Ex: A man, a plan, a canal: Panama;
public class QNA_04_PLINDROME {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Preprocess: remove non-alphanumeric characters and convert to lowercase
            String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Reverse the processed string
            String reversed = new StringBuilder(processed).reverse().toString();

            // Check for palindrome
            if (processed.equals(reversed)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is NOT a palindrome.");
            }

            scanner.close();
        }



}
