package edu.kis.vh.stacks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackFIFOTest {

    @Test
    public void pop() throws Exception {
        Stack stack = new StackFIFO();
        stack.push(1);
        stack.push(2);
        assert(stack.pop() == 1);
        assert(stack.pop() == 2);
        assert(stack.pop() == Stack.EMPTY_STACK_VALUE);
    }
}
