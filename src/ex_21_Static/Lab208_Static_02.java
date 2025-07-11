package ex_21_Static;

public class Lab208_Static_02 {

    public static void main(String[] args) {
        ATB goutam = new ATB(987654321,"Goutam");
        ATB barman = new ATB(987654387,"Barman");
        System.out.println(goutam.phone_np);
        System.out.println(barman.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.markAttendance();
    }
}

class ATB{

    int phone_np;
    String name;
    static String course_name = "ATB";

    public ATB(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void markAttendance(){
        System.out.println("Mark Attendance");
    }
}
