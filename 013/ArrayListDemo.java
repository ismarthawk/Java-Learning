import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> li = new ArrayList<>();

        li.add("Geeks");
        li.add("Geeks");
        li.add(1, "For");

        System.out.println(li);

        li.set(1, "GEEKS");
        System.out.println(li);

        System.out.println(li.indexOf("GEEKS"));

        System.out.println(li.get(1));

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(0);
        l.add(2);

        System.out.println(l);

        // l.remove(0);

        Integer i = Integer.valueOf(0);
        l.remove(i);

        System.out.println(l);
        System.out.println(l.contains(1));

        for (String s : li) {
            System.out.println(s);
        }

        ArrayList a = new ArrayList();
        a = (ArrayList) li.clone();

        System.out.println(a);

        Iterator<String> iter = li.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        a.removeIf(n -> (((String) n).length() <= 10));
        System.out.println(a);
    }
}