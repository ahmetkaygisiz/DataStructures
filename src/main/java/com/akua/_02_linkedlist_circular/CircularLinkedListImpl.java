package com.akua._02_linkedlist_circular;

public class CircularLinkedListImpl {
    private Node head;
    private Node tail;

    public void add(Object value){
       Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            tail.setNext(newNode);
        }

        tail = newNode;
        tail.setNext(head);
    }

    public void print(){
        if(head != null){
            Node current  = head;
            String output = "List : [ ";

            do{
                output += current.getValue() + " ";
                current = current.getNext();
            }while(current != head);

            output += "]";
            System.out.println(output);
        }
    }

    public void delete(){
        if (head != null) {
            if (head.getNext() == null || head == tail) {
                head = null;
                tail = null;
            }else {
                Node current = head;

                while(current.getNext() != tail){
                    current = current.getNext();
                }

                current.setNext(head);
                tail = current;
            }
        }
    }
}
