package list;

public class LinkedList<T> implements IList<T> {

    private Node head;
    private int size = 0;

    @Override
    public void add(T item) {
        if (head == null) {
            head = new Node(item);
            size++;
            return;
        }
        Node node = head;
        while (true) {
            if (node.next == null) {
                node.next = new Node(item);
                size++;
                return;
            }
            node = node.next;
        }
    }

    @Override
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println("\n");
    }

    private class Node {
        T data;
        Node next = null;

        Node(T data) {
            this.data = data;
        }
    }
}
