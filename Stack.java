package core;

import java.util.ArrayList;

public class Stack implements Istack {

    private ArrayList<Object> elm = new ArrayList<Object>();

    public boolean isEmpty() {
        return elm.isEmpty();
    }

    public int getsize() {
        return elm.size();
    }

    public void push(Object element) {
        elm.add(element);
    }

    public Object top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elm.get(elm.size() - 1);
    }

    public boolean isFull() {
        return false;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot perform pop.");
        }
        elm.remove(elm.size() - 1);
    }

}