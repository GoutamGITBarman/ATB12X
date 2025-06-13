package ex_01_Java_Basics;

import java.util.Scanner;
// This line helps us get input from the user
public class TaskGrade001 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of subjects:");
            int numberOfSubjects = scanner.nextInt();

            int totalMarksObtained = 0;
            int maxTotalMarks = numberOfSubjects * 100; // Assuming each subject is out of 100

            for (int i = 1; i <= numberOfSubjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = scanner.nextInt();
                // Basic validation for marks
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks entered for subject " + i + ". Please enter marks between 0 and 100.");
                    // You might want to re-prompt or handle this error more robustly
                    i--; // Decrement i to re-enter marks for the current subject
                    continue;
                }
                totalMarksObtained += marks;
            }

            // Call the method to get grade and percentage
            String[] result = calculateGradeAndPercentage(totalMarksObtained, maxTotalMarks);

            System.out.println("\n--- Student Result ---");
            System.out.println("Percentage: " + result[0] + "%");
            System.out.println("Grade: " + result[1]);

            scanner.close();
        }

        /**
         * Calculates the percentage and assigns a grade based on the total marks obtained.
         *
         * @param totalMarksObtained The sum of marks obtained by the student.
         * @param maxTotalMarks      The maximum possible total marks.
         * @return A String array where result[0] is the percentage and result[1] is the grade.
         */
        public static String[] calculateGradeAndPercentage(int totalMarksObtained, int maxTotalMarks) {
            String[] result = new String[2];

            if (maxTotalMarks <= 0) {
                result[0] = "N/A"; // Not Applicable
                result[1] = "Error: Max total marks cannot be zero or less.";
                return result;
            }

            double percentage = ((double) totalMarksObtained / maxTotalMarks) * 100;
            result[0] = String.format("%.2f", percentage); // Format to 2 decimal places

            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B+";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }
            result[1] = grade;

            return result;
        }


}
