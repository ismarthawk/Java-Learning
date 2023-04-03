public class Example1 {
    public static void main(String[] args) {
        int a = 100;
        if (a < 0) {
            System.out.println("The number is less than 0");
        } else if (a == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is positive");
        }

        switch (a) {
            case 0:
                System.out.println("The number is zero");
                break;
            default:
                System.out.println("Great!, not zero");
        }
    }
}