import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(20);
        stk.push(30);
        stk.push(40);

        System.out.println(stk);
        while (!stk.empty()) {
            System.out.println(stk.peek());
            // stk.pop();
        }

    }
}
