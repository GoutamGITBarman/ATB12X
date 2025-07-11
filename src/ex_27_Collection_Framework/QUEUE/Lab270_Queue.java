package ex_27_Collection_Framework.QUEUE;
import java.util.PriorityQueue;
public class Lab270_Queue {

    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        // FIFO
        PriorityQueue q = new PriorityQueue();
        q.add("Goutam");
        q.add("Barman");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
