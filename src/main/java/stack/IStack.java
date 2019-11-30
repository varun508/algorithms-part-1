package stack;

public interface IStack<T> {

    boolean isEmpty();

    void push(T item);

    T pop();

    void display();
}
