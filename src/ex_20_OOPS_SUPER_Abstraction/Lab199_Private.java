package ex_20_OOPS_SUPER_Abstraction;

public class Lab199_Private {
}

class XYZ {
    XYZ() {
    }
    protected int my_gold = 10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }

}
