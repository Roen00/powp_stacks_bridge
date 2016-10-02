package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackArray;
import edu.kis.vh.stacks.list.StackInterface;

/**
 * The class which implements basic stack functionality
 */
public class Stack {

    private final StackInterface stack;

    public Stack(StackInterface stack) {
        this.stack = stack;
    }

    /**
     * provides default stack implementation which is StackArray
     */
    public Stack() {
        this(new StackArray());
    }


    public void push(int i) {
        stack.pushElement(i);
    }

    public boolean isEmpty() {
        return stack.empty();
    }

    public boolean isFull() {
        return stack.full();
    }

    public int top() {
        return stack.peek();
    }

    public int pop() {
        return stack.pop();
    }

}
