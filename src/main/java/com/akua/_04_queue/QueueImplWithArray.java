package com.akua._04_queue;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

public class QueueImplWithArray<T> {
    private Object[] queueArray;
    private int maxSize;
    private int rear;

    public QueueImplWithArray(int maxSize){
        this.maxSize = maxSize;
        queueArray = new Object[maxSize];
        rear = -1;
    }

    // Insert an element at the end of the queue.
    public void enQueue(Object value){
        if(!isFull())
            queueArray[++rear] = value;
        else
            System.out.println("Queue is full. Couldn't added the value : " + value);
    }

    public T front(){
        if(!isEmpty())
            return (T) queueArray[0];
        System.out.println("Queue is empty.");
        return null;
    }

    public T deQueue(){
        if(!isEmpty()) {
            T tmp = (T) queueArray[0];

            for (int i = 1; i < rear + 1; i++)
                queueArray[ i - 1 ] = queueArray[i];

            queueArray[rear] = null;
            rear--;
            return tmp;
        }

        System.out.println("Queue is empty.");
        return null;
    }

    public boolean isFull(){
        return ( maxSize - 1 == rear );
    }

    public boolean isEmpty(){
        return ( rear == -1 );
    }

    public int queueSize(){
        return (rear + 1);
    }

    public void printQueue(){
        System.out.println(Arrays.toString(queueArray));
        // Arrays.stream(queueArray).forEach(s -> System.out.print(s + " "));
        // Arrays.stream(queueArray).forEach(System.out::println);
        // Stream.of(queueArray).forEach(System.out::println)
    }

}
