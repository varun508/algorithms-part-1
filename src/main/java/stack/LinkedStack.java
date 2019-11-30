package stack;

public class LinkedStack<T> implements IStack<T> {

    private Node first;

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void push(T item) {
        Node newNode = new Node(item);
        newNode.next = first;
        first = newNode;
    }

    @Override
    public T pop() {
        T data = first.item;
        first = first.next;
        return data;
    }

    @Override
    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.item);
            if (temp.next != null) System.out.print(", ");
            temp = temp.next;
        }
        System.out.println();
    }

    class Node {

        Node(T item) {
            this.item = item;
        }

        Node next;
        T item;
    }
}
