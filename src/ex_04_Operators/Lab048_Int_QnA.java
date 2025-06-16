package ex_04_Operators;

public class Lab048_Int_QnA {
    public static void main(String[] args) {

        int goutam_salary = 12;
        boolean b = !(goutam_salary > 10 || goutam_salary < 5);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false




    }
}
