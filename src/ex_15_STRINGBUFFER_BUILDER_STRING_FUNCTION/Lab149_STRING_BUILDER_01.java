package ex_15_STRINGBUFFER_BUILDER_STRING_FUNCTION;

public class Lab149_STRING_BUILDER_01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
