package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;

/**
 * Default implementation of StacksFactory
 */
public class DefaultStacksFactory implements IStacksFactory {

    @Override
    public Stack GetStandardStack() {
        return new Stack();
    }

    @Override
    public Stack GetFalseStack() {
        return new Stack();
    }

    @Override
    public StackFIFO GetFIFOStack() {
        return new StackFIFO();
    }

    @Override
    public StackHanoi GetHanoiStack() {
        return new StackHanoi();
    }

}
