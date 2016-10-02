package edu.kis.vh.stacks;

public class Stack {
    public final static int EMPTY = -1;
    public final static int MAX_NUMBER_OF_ELEMENTS = 12;

    private final int[] items = new int[MAX_NUMBER_OF_ELEMENTS];
    private int total = EMPTY;

    public void push(int i) {
        if (!isFull())
            items[++total] = i;
    }

    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_NUMBER_OF_ELEMENTS - 1;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return items[total];
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        return items[total--];
    }

}
