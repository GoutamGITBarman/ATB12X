package ex_08_IF_Cond;

public class Lab079_IF {

    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if(age > 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't vote!");
        }


    }
}
