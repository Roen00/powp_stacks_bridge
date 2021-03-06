package edu.kis.vh.stacks.stack;

public class StackList implements StackInterface {
    private Node last;

    @Override
    public void pushElement(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public boolean empty() {
        return last == null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public int peek() {
        if (empty())
            return StackInterface.EMPTY_STACK_VALUE;
        return last.value;
    }

    @Override
    public int pop() {
        if (empty())
            return StackInterface.EMPTY_STACK_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}
