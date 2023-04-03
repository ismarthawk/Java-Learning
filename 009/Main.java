public class Main {

    public static void throwFunc() throws ArrayIndexOutOfBoundsException {
        System.out.println("Throw Errors function");
        throw new ArrayIndexOutOfBoundsException("hello this is the error statement");
    }

    public static void main(String[] args) {
        try {
            throwFunc();
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        } finally {
            System.out.println("This is the finally error after the catch");
        }
    }
}