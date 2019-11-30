package stack;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class LinkedStack<T> implements IStack<T>, Iterable<T> {

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

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new LinkedStackIterator();
    }

    private class Node {

        Node(T item) {
            this.item = item;
        }

        Node next;
        T item;
    }

    private class LinkedStackIterator implements Iterator<T> {

        private Node top = first;

        @Override
        public boolean hasNext() {
            return top != null;
        }

        @Override
        public T next() {
            Node node = top;
            top = top.next;
            return node.item;
        }
    }
}
