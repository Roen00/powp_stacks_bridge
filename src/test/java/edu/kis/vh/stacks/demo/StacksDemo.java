package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;

class StacksDemo {

    public static void main(String[] args) {
        testStacks(new DefaultStacksFactory());
    }

    private static void testStacks(IStacksFactory factory) {
        Stack[] stacks = {factory.GetStandardStack(), factory.GetFalseStack(),
                factory.GetFIFOStack(), factory.GetHanoiStack()};
        final int numberOfStacks = stacks.length - 1;
        final int numberOfPushedElementsToStack = 15;

        fillAllStacksExceptHanoi(numberOfPushedElementsToStack, stacks, numberOfStacks);

        final Stack hanoisStack = stacks[numberOfStacks];
        fillHanoiStack(numberOfPushedElementsToStack, hanoisStack);
        printAllStacks(stacks);


        System.out.println("total rejected is "
                + ((StackHanoi) stacks[3]).reportRejected());
    }

    private static void fillAllStacksExceptHanoi(int numberOfPushedElementsToStack, Stack[] stacks,
                                                 int numberOfStackWithoutLast) {
        //zle formatowanie
        for (int i = 1; i < numberOfPushedElementsToStack; i++) {
            for (int j = 0; j < numberOfStackWithoutLast; j++) {
                stacks[j].push(i);
            }
        }
    }

    private static void fillHanoiStack(int numberOfPushedElementsToStack, Stack stack) {
        java.util.Random rn = new java.util.Random();
        final int maximumRandomValue = 20;
        for (int i = 1; i < numberOfPushedElementsToStack; i++) {
            stack.push(rn.nextInt(maximumRandomValue));
        }
    }

    private static void printAllStacks(Stack[] stacks) {
        //zle formatowanie
        System.out.println("=====================================");
        for (Stack stack : stacks) {
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + "  ");
            }
            //zle formatowanie
            System.out.println();
            System.out.println("=====================================");
        }
    }
}//brak pustej lini na koncu pliku
