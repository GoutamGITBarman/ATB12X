package ex_15_STRINGBUFFER_BUILDER_STRING_FUNCTION;
//INTERVIEW QUE REVERSE WITHOUT STRING IN BUILT
public class Lab144_Int_QnA_Reverse {
    public static void main(String[] args) {

        String input = "Pramod";
        // domarP

        for (int i= input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }

        System.out.println("");

        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());


    }
}
