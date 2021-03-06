package stack;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<T> implements IStack<T>, Iterable<T> {

    private T[] items;
    private int top = -1;
    private int capacity;

    ArrayStack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    ArrayStack(int capacity) {
        this.capacity = capacity;
        items = (T[]) new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return items[top] == null;
    }

    @Override
    public void push(T item) {
        if (item == null) throw new IllegalArgumentException("Cannot add null to stack");
        if (top == capacity - 1) throw new StackOverflowError("Cannot add more items to stack");
        items[++top] = item;
    }

    @Override
    public T pop() {
        if (top < 0) throw new IllegalArgumentException("StackUnderflowException: Cannot pop items from stack");
        T item = items[top];
        items[top--] = null;
        return item;
    }

    @Override
    public void display() {
        System.out.println(Arrays.toString(items));
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator<T> {
        private int i = top;

        @Override
        public boolean hasNext() {
            return i > -1;
        }

        @Override
        public T next() {
            return items[i--];
        }
    }
}
