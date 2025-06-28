package ex_15_STRINGBUFFER_BUILDER_STRING_FUNCTION;

public class Lab146_STRING_BUILDER_BUFFER {

    public static void main(String[] args) {
        // String - 90%
        String s0 = "GOUTAM BARMAN";
        String s1 = new String("GOUTAM BARMAN");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("GOUTAM BARMAN");
        StringBuilder stringBuilder = new StringBuilder("GOUTAM BARMAN");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
