public class Example3 {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i += 2) {
        // System.out.print(i + " ");
        // }
        boolean done = false;
        int val = -1;
        for (int i = 200; !done; i += 1) {
            if (i % 23 == 0) {
                val = i;
                done = true;
            }
        }

        System.out.println("The multiple of 19 after 200 is : " + val);

    }
}
