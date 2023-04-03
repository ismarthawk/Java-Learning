public class Example1 {
    public static void main(String[] args) {
        byte a = 100;
        // a = a * 2; This causes error because of the automatic type promption in java
        a = (byte) (a * 2);
        System.out.println(a);
    }
}