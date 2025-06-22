package ex_05_Type_Casting;

public class Lab059_Type_Casting_02 {
    //public class Lab059_TypeCasting_Narrowing
        public static void main(String[] args) {
            int val = 300;
//        byte b = val; // Narrowing - Implicit JVM to do it. - Data loss will be there.
            byte b1 = (byte) val; // Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
            System.out.println(b1); // 44




        }
}
