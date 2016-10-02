package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackFIFO extends Stack {

    final private Stack temp;

    public StackFIFO() {
        super();
        temp = new Stack(new StackList());
    }

    public StackFIFO(StackInterface stackInterface) {
        super(stackInterface);
        temp = new Stack(stackInterface);
    }

    @Override
    public int pop() {
        while (!isEmpty()) {
            temp.push(super.pop());
        }

        int ret = temp.pop();

        while (!temp.isEmpty()) {
            push(temp.pop());
        }

        return ret;
    }
}
