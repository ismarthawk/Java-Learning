
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> map = new HashSet<>();
        map.add(200);
        map.add(300);
        map.add(400);

        System.out.println(map.remove(100));
        System.out.println(map.remove(200));
        System.out.println(map.contains(300));

        HashSet<Integer> h = new HashSet<>();
        h = (HashSet) map.clone();
        System.out.println(map.equals(h));

        int[] a = new int[] { 1, 2, 3, 4 };
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i : a) {
            a1.add(i);
        }

        System.out.println(a1);

        ArrayList<Integer> a2 = new ArrayList<>(a1);
        System.out.println(a2);

        ArrayList<Integer> a3 = new ArrayList<>(a2);
        a3.remove(Integer.valueOf(3));

        HashSet<ArrayList<Integer>> h1 = new HashSet<>();
        h1.add(a1);
        h1.add(a2);

        HashSet<ArrayList<Integer>> h2 = new HashSet<>();
        h2.add(a2);
        h2.add(a3);

        HashSet<ArrayList<Integer>> union = new HashSet<>();
        union.addAll(h1);
        union.addAll(h2);
        System.out.println(union);

        HashSet<ArrayList<Integer>> inter = new HashSet<>();
        inter.addAll(h1);
        inter.retainAll(h2);
        System.out.println(inter);
    }
}
