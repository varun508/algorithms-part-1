package stack;

public class Runner {
    public static void main(String[] args) {
        System.out.println("\n\nResult for Linked Stack ->");
        run(new LinkedStack<>());

        System.out.println("\n\nResult for Array Stack ->");
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
