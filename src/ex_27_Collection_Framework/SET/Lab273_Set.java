package ex_27_Collection_Framework.SET;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Lab273_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Goutam");
        hs.add("Goutam");
        hs.add("Goutam");
        hs.add("Goutam");
        System.out.println(hs);

    }

}
