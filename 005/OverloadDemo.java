public class OverloadDemo {

    int val1;
    int val2;

    public OverloadDemo(int val1) {
        System.out.println("Single parameter constructor called");
        this.val1 = val1;
        this.val2 = 0;
    }

    public OverloadDemo(int val1, int val2) {
        System.out.println("2 Parameters constructor called");
        this.val1 = val1;
        this.val2 = val2;
    }

    public static void printNumber(int n) {
        System.out.println("The number is int : " + n);
    }

    public static void printNumber(double n) {
        System.out.println("The number is double : " + n);
    }

    public static void main(String[] args) {

        // Method overloading
        printNumber(100);
        printNumber(100.2);

        // constructor overloading
        OverloadDemo obj = new OverloadDemo(100, 200);
        OverloadDemo obj2 = new OverloadDemo(100);

        System.out.println(obj.toString());
        System.out.println(obj2.toString());
    }
}