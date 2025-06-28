package ex_19_OOPS_02.AccessModifier.Police;

public class JrCop {
    private static int gun;

    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
        System.out.println(JrCop.gun);
        JrCop.canIShoot();
    }

    private static void canIShoot() {

        System.out.println("You Can Shoot");
    }

}
