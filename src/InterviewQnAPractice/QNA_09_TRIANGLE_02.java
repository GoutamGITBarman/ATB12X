package InterviewQnAPractice;
//Left Triangle Star Pattern;
public class QNA_09_TRIANGLE_02 {

    public static void main(String[] args) {

        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
