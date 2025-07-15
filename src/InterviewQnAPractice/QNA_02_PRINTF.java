package InterviewQnAPractice;
//Table Print using System.out.printf;
public class QNA_02_PRINTF {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= 10; i++) {
           // System.out.printf("%d\t%d\t\n", i+”x”+n+”=”,5 *i);
            //Syntax Error Corrected;
            // ” and “ (curly quotes) are not valid in Java. Java requires standard double quotes: ".
            //
            //Also, the way you're trying to concatenate strings and numbers inside the printf() method is not valid.
            // printf() uses format specifiers like %d, %s, etc., and you need to supply the correct number and
            // type of arguments.
            System.out.printf("%d x %d = %d\n", i, n, i * n);
        }

    }

}
