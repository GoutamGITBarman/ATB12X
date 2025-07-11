package ex_27_Collection_Framework.List;

import java.util.Vector;

public class Lab253_Vector {

    public static void main(String[] args) {
        Vector v = new Vector(); // Array

        v.add("goutam");
        v.add("barman");
        v.add("india");
        System.out.println(v);
        v.remove("barman");
        System.out.println(v);
        System.out.println(v.contains("india"));
    }
}
