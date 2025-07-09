package ex_19_OOPS_02.Poly.MethodOverriding;

public class Goutam extends Father{
    void g1(){
        System.out.println("goutam - g1");
    }

    @Override
    void home(){
        System.out.println("goutam - 3BHK");
    }
}
