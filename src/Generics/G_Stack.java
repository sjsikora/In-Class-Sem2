package Generics;

import java.util.ArrayList;

public class G_Stack<E> {
    private ArrayList<E> stack;
    private final int DEFAULT_SIZE = 10;

    public G_Stack() {
        stack = new ArrayList<E>(DEFAULT_SIZE);
    }

    public G_Stack(int size) {
        stack = new ArrayList<E>(size);
    }

    public void push(E item) {
        stack.add(item);
    }

    public int size() {
        return stack.size();
    }

    public void remove(int index) {
        stack.remove(index);
    }

    public E pop() {
        return size() > 0 ? stack.remove(size() - 1) : null;
    }

}
