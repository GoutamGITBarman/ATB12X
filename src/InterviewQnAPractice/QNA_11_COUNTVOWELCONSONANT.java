package InterviewQnAPractice;

import java.util.Scanner;

//Count vowels and consonants in a String;
public class QNA_11_COUNTVOWELCONSONANT {
    public int[] countVowelsCons(String str) {
                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Convert input to lowercase for easy comparison
        input = input.toLowerCase();
        int vCount = 0;
        int cCount = 0;
        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            // Check if it's a letter
            if (Character.isLetter(ch)) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if(ch >= 'a' && ch <= 'z') {
                cCount++;

                }
            }
        }


// Output the results
        System.out.println("Vowels: " + vCount);
        System.out.println("Consonants: " + cCount);

        scanner.close();
        return new int[]{vCount, cCount};
    }

}
