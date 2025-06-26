package ex_10_FOR_Loop;
// FOR LOOP CONTINUE EVEN NUMBER FINDER
public class Lab113_FOR_Loop_16 {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }


    }
}
