package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;

/**
 * Interface of stacks factory
 */
public interface IStacksFactory {

    public Stack GetStandardStack();

    public Stack GetFalseStack();

    public StackFIFO GetFIFOStack();

    public StackHanoi GetHanoiStack();

}
