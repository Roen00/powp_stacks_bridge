package edu.kis.vh.stacks;

/**
 * The class which implements basic stack functionality
 */
public class Stack {
    public final static int EMPTY_STACK_VALUE = -1;
    public final static int STACK_CAPACITY = 12;

    private final int[] items = new int[STACK_CAPACITY];
    private int total = EMPTY_STACK_VALUE;

    public void push(int i) {
        if (!isFull()) {
            items[++total] = i;
        }
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        } else {
            return items[total];
        }
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK_VALUE;
        } else {
            return items[total--];
        }
    }

}
