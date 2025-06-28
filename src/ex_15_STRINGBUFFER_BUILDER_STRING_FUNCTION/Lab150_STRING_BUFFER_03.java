package ex_15_STRINGBUFFER_BUILDER_STRING_FUNCTION;

public class Lab150_STRING_BUFFER_03 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
//        sb.delete(5,16); // Delete the substring
//        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);

    }
}
