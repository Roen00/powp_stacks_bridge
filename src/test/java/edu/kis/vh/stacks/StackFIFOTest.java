package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackInterface;
import org.junit.Test;

public class StackFIFOTest {

    @Test
    public void pop() throws Exception {
        Stack stack = new StackFIFO();
        stack.push(1);
        stack.push(2);
        assert(stack.pop() == 1);
        assert(stack.pop() == 2);
        assert(stack.pop() == StackInterface.EMPTY_STACK_VALUE);
    }
}
