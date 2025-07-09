package ex_19_OOPS_02.Poly.MethodOverriding;

public class Lab194 {
    public static void main(String[] args) {
        Goutam g = new Goutam();
        g.home();
        g.g1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Goutam();
        f2.home();


    }
}
