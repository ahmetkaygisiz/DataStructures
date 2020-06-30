package com.akua._03_stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> {
    private Object[] stackArray;
    private int maxSize;
    private int top;

    public StackImpl(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackArray = new Object[maxSize];
    }

    // Add items to stack array
    public void push(Object value){
        if(!isFull())
            stackArray[++top] = value;
        else
            System.out.println("Stack is full. Couldn't added last value : " + value);
    }

    // Remove top element
    public T pop(){
        if(!isEmpty())
            return (T) stackArray[top--];
        System.out.println("Stack is empty");
        return null;
    }

    // Remove all elements
    public List<T> popAll(){
        List<T> clearStack = new ArrayList<T>();

        while(!isEmpty()){
            clearStack.add(pop());
        }

        return clearStack;
    }

    // Peek Top Element
    public T peek(){
        if(!isEmpty())
            return (T) stackArray[top];

        System.out.println("Stack is empty.");
        return null;
    }

    // Check stackArray size
    public boolean isFull(){
        return (top == maxSize - 1);
    }

    // Check stackArray is empty
    public boolean isEmpty(){
        return (top == -1);
    }
}
