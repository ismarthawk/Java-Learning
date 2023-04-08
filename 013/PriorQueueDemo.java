import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(20);
        q.add(30);
        q.add(-100);
        q.add(200);
        q.add(2003);
        q.add(-400);
        System.out.println(q);
        System.out.println(q.contains(20));

        // for (Integer i : q) {
        // System.out.println(i);
        // }

        // while (!q.isEmpty()) {
        // System.out.println(q.poll());
        // }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new GreaterComparator());
        pq.add(200);
        pq.add(300);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // System.out.println(q.contains(20));
    }
}

class GreaterComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2)
            return -1;
        return 1;
    }

}
