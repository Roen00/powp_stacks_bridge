package edu.kis.vh.stacks;

public interface StackInterface {
    int EMPTY_STACK_VALUE = -1;

    void pushElement(int i);

    boolean empty();

    boolean full();

    int peek();

    int pop();
}
