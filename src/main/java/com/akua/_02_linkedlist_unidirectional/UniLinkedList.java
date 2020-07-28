package com.akua._02_linkedlist_unidirectional;

public class UniLinkedList<T>{
    private Node head;
    private int count = 0;

    public void add(Object value){
        Node newNode = new Node(value, null);

        if(head == null){
            this.head = newNode;
            count++;
            return ;
        }

        Node currentItem = head;

        while(currentItem.getNext() != null){
            currentItem = currentItem.getNext();
        }

        currentItem.setNext(newNode);
        count++;
    }

    public void print(){
        if(head != null){
            Node currentItem  = head;
            String output = "List : [ ";

            while(currentItem != null){
                output += currentItem.getValue() + " ";
                currentItem = currentItem.getNext();
            }
            output += "]";

            System.out.println(output);
        }
    }

    public void delete(){
        if (head != null) {
            if(head.getNext() == null){
                head = null;
            }else{
                Node currentItem = head;
                while ( currentItem.getNext().getNext() != null){
                    currentItem = currentItem.getNext();
                }
                currentItem.setNext(null);
            }
            count--;
        }
    }

    public void updateValueByIndex(int index, Object value){
        Node current = head ;
        int i = 1;

        if(index <= count && index > 0){
            while(i != index ){
                current = current.getNext();
                i++;
            }

            current.setValue(value);
        }
    }

    public void deleteByIndex(int index){
        if(head != null){
            Node current = head;

            if( index <= 1 ){
                if(head.getNext() != null) // if exists the next value
                    this.head = head.getNext();
                 else
                    this.head = null;
                count--;
            }else if(index == count  || index > count ){
                delete();
            }else{
                int tmp = 1;

                while(tmp++ != (index - 1) ){
                    current = current.getNext();
                }

                current.setNext(current.getNext().getNext());
                count--;
            }
        }
    }

    public int getCount() {
        return count;
    }

    public Node getHead(){
        return head;
    }
}
