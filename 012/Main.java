import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // float i = 1;
        // Float f = Float.valueOf(i / 0);

        // System.out.println(f.floatValue());

        Float f = Float.valueOf(10);
        System.out.println(f > 200);

        // Scanner s = new Scanner(System.in);
        // int a, b;
        // a = s.nextInt();
        // b = s.nextInt();
        // System.out.println(a + " " + b);

        String s = "234.11";
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException n) {
            System.out.println(n.toString());
            System.out.println((int) Float.parseFloat(s));
        }
        s = Double.toString(Math.random());
        System.out.println(s);
    }

}