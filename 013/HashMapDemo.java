import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Damodar");
        map.put(2, "surya");
        map.put(3, "naidu");

        // System.out.println(map);
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }

        System.out.println(map.get(3));

        for (int i : map.keySet()) {
            System.out.println(i);
        }
    }
}
