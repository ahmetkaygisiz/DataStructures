package com.akua._04_queue;

import com.akua._02_linkedlist_unidirectional.UniLinkedList;

public class QueueImplWithLinkedList<T> {
    private UniLinkedList<T> list;
    private int maxSize;

    public QueueImplWithLinkedList(int maxSize){
        this.maxSize = maxSize;
        list = new UniLinkedList<T>();
    }

    public void enQueue(Object value){
        if(!isFull())
            list.add(value);
        else
            System.out.println("Queue is full. Couldn't added the value : " + value);
    }

    public T front(){
        if(!isEmpty())
            return (T) list.getHead().getValue();
        return null;
    }

    public T deQueue(){
        if(!isEmpty()){
            T tmp = (T) list.getHead().getValue();
            list.deleteByIndex(1);
            return tmp;
        }else{
            System.out.println("Queue is empty.");
            return null;
        }
    }

    public boolean isFull(){
        if(!isEmpty())
            return (list.getCount() == maxSize);
        return false;
    }

    public boolean isEmpty(){
        return (list.getHead() == null);
    }

    public int queueSize(){
        if(!isEmpty())
            return list.getCount();
        return 0;
    }

    public void printQueue(){
        if(!isEmpty())
            list.print();
    }
}
