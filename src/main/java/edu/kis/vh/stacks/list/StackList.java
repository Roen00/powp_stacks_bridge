package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.Stack;

public class StackList {

    private Node last;

    public void pushElement(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean empty() {
        return last == null;
    }

    public boolean full() {
        return false;
    }

    public int peek() {
        if (empty())
            return Stack.EMPTY_STACK_VALUE;
        return last.value;
    }

    public int pop() {
        if (empty())
            return Stack.EMPTY_STACK_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}
