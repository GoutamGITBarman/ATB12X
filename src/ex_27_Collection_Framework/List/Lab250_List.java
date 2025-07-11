package ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab250_List {

    public static void main(String[] args) {
        List fruits = List.of("orange","apple","guava","mango","watermelon");
        System.out.println(fruits);

        List arrayList = new ArrayList<>();
        arrayList.add("goutam");
        arrayList.add(null);
        arrayList.add("barman");
        arrayList.add("barman"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());



    }
}
