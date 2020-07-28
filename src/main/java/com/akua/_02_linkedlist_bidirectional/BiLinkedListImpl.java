package com.akua._02_linkedlist_bidirectional;

public class BiLinkedListImpl {
    private Node head;
    private Node tail;


    public void addEnd(Object value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            tail.setNext(newNode);
        }
        newNode.setPrev(tail);
        tail = newNode;
    }

    public void addHead(Object value){
        Node newNode = new Node(value);

        if (head != null) {
            head.setPrev(newNode);
            newNode.setNext(head);
        }

        head = newNode;
    }

    public void printForward(){
        if(head != null){
            Node current  = head;
            String output = "List : [ ";

            while(current != null){
                output += current.getValue() + " ";
                current = current.getNext();
            }
            output += "]";

            System.out.println(output);
        }
    }

    public void printBackward(){
        if(tail != null){
            Node current = tail;

            String output = "List : [ ";

            while(current != null){
                output += current.getValue() + " ";
                current = current.getPrev();
            }
            output += "]";

            System.out.println(output);
        }
    }

    public void deleteFromHead(){
        if(head != null){
            if(head == tail){
                head = null;
                tail = null;
            }else {
                head = head.getNext();
            }
        }
    }

    public void deleteFromTail(){
        if(head != null){
            if (head.getNext() == null || head == tail) {
                head = null;
                tail = null;
            }else {
                tail = tail.getPrev();
            }
        }
    }

}
