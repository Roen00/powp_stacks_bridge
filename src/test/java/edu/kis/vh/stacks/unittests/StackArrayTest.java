package edu.kis.vh.stacks.unittests;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackArray;
import org.junit.Assert;
import org.junit.Test;

public class StackArrayTest {

    @Test
    public void testPush() {
        Stack stackObj = new Stack();
        int testValue = 4;
        stackObj.push(testValue);

        int result = stackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        Stack stackObj = new Stack();
        boolean result = stackObj.isEmpty();
        Assert.assertEquals(true, result);

        stackObj.push(888);

        result = stackObj.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        Stack stackObj = new Stack();
        for (int i = 0; i < StackArray.STACK_CAPACITY; i++) {
            boolean result = stackObj.isFull();
            Assert.assertEquals(false, result);
            stackObj.push(888);
        }

        boolean result = stackObj.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testTop() {
        Stack stackObj = new Stack();

        int result = stackObj.top();
        Assert.assertEquals(Stack.EMPTY_STACK_VALUE, result);

        int testValue = 4;
        stackObj.push(testValue);

        result = stackObj.top();
        Assert.assertEquals(testValue, result);
        result = stackObj.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPop() {
        Stack stackObj = new Stack();

        int result = stackObj.pop();
        Assert.assertEquals(Stack.EMPTY_STACK_VALUE, result);

        int testValue = 4;
        stackObj.push(testValue);

        result = stackObj.pop();
        Assert.assertEquals(testValue, result);
        result = stackObj.pop();
        Assert.assertEquals(Stack.EMPTY_STACK_VALUE, result);
    }

}
