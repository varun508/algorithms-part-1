package stack;

public class Runner {
    public static void main(String[] args) {
        run(new LinkedStack<>());
        run(new ArrayStack<>());
    }

    private static void run(IStack<String> stack) {
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        stack.display();
        stack.pop();
        stack.display();
    }
}
