package edu.kis.vh.stacks;

public class StackArray implements StackInterface {
    public final static int EMPTY_STACK_VALUE = -1;
    public final static int STACK_CAPACITY = 12;

    private final int[] items = new int[STACK_CAPACITY];
    private int total = EMPTY_STACK_VALUE;

    @Override
    public void pushElement(int i) {
        if (!full()) {
            items[++total] = i;
        }
    }

    @Override
    public boolean empty() {
        return total == EMPTY_STACK_VALUE;
    }

    @Override
    public boolean full() {
        return total == STACK_CAPACITY - 1;
    }

    @Override
    public int peek() {
        if (empty()) {
            return EMPTY_STACK_VALUE;
        } else {
            return items[total];
        }
    }

    @Override
    public int pop() {
        if (empty()) {
            return EMPTY_STACK_VALUE;
        } else {
            return items[total--];
        }
    }
}
