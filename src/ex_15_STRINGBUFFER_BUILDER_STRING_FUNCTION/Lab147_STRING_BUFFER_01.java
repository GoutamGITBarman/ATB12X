package ex_15_STRINGBUFFER_BUILDER_STRING_FUNCTION;

public class Lab147_STRING_BUFFER_01 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("GOUTAM");
        stringBuffer.append("BARMAN");
        System.out.println(stringBuffer);

        String s1 = "GOUTAM";
        s1 = s1+ "BARMAN";
        System.out.println(s1);


    }
}
