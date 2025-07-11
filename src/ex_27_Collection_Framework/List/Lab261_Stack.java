package ex_27_Collection_Framework.List;
import java.util.Stack;
public class Lab261_Stack {

    public static void main(String[] args) {
        // Stack
        //  List In and First Out

//        Stack s = new Stack();
//        s.add("goutam");
//        s.add("barman");
//        s.add("india");

        Stack s = new Stack();
        s.push("goutam");
        s.push("barman");
        s.push("india");
        s.push("bharat");
        System.out.println(s);


        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));

    }

}
