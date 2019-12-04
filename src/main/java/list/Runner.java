package list;

public class Runner {

    public static void main(String[] args) {
        run(new LinkedList<>());
    }

    private static void run(IList<Integer> list) {
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(0);

        list.display();
    }
}
