package ex_14_STRINGS;

public class Lab135_STRING_IMMUTABLE_01 {
    public static void main(String[] args) {
        String s1 = "hello";
        s1  = s1.concat("world");
        System.out.println(s1);
    }
}
