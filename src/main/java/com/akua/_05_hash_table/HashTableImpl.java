package com.akua._05_hash_table;

public class HashTableImpl {
    private Node[] hashArr;
    private int size;

    public HashTableImpl(int size){
        this.size = size;
        hashArr = new Node[size];
    }

    public int generateKey(Object value){
        return Math.abs(value.toString().hashCode() % size);
    }

    public void add(Object value){
        int key = generateKey(value);

        if (hashArr[key] == null) {
            hashArr[key] = new Node();
            hashArr[key].setValue(value);
        }else{
            Node currentNode = hashArr[key];

            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(value));
        }
    }

    public void printHashTable(){
        for(int i = 0; i < size ; i++){
            Node tmpNode = hashArr[i];
            System.out.print("i : " + i + " Values -- ");

            while(tmpNode != null){
                System.out.print(tmpNode.getValue() + " -> ");
                tmpNode = tmpNode.getNext();
            }

            System.out.println();
        }
    }

    // Needs to be improved !!!
    public void removeValue(Object value){
        int key = generateKey(value);
        Node current = hashArr[key];

        if(current != null){
            if(current.getValue() == value){
                if(current.getNext() == null)
                    hashArr[key] = null;
                else
                    hashArr[key] = current.getNext();
            }else{
                boolean found = false;

                while(current.getNext() != null){
                    if(current.getNext().getValue() == value){
                        found = true;
                        break;
                    }
                    current = current.getNext();
                }

                if(found){
                    if(current.getNext().getNext() != null)
                        current.setNext(current.getNext().getNext());
                    else
                        current.setNext(null);
                }else{
                    if (current.getValue() == value)
                        current = null;
                }
            }
        }
    }
}
