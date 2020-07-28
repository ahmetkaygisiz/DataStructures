package com.akua;

import com.akua._01_dynamic_array.DynamicArray;
import com.akua._02_linkedlist_bidirectional.BiLinkedListImpl;
import com.akua._02_linkedlist_circular.CircularLinkedListImpl;
import com.akua._02_linkedlist_unidirectional.UniLinkedList;
import com.akua._03_stack.StackImpl;
import com.akua._04_queue.QueueImplWithArray;
import com.akua._04_queue.QueueImplWithLinkedList;
import com.akua._05_hash_table.HashTableImpl;
import com.akua._06_binary_search_tree.BinarySearchTreeImpl;

import java.util.Hashtable;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        // dynamicArray();
        // uniLinkedList();
        //circularLinkedList();
        // biLinkedList();
        // stack();
        // queueWArray();
        // queueWLinkedList();
        // hashtable();
        binarySearchTree();
    }

    public static void dynamicArray(){
        DynamicArray dynamicArr = new DynamicArray();

        dynamicArr.add(2);
        dynamicArr.add('A');
        dynamicArr.add(1232L);
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.add('q');
        dynamicArr.add(11);
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.shrinkArray();
        dynamicArr.toStringSizeAndCapacity();

        dynamicArr.removeAt(1);
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.printArray();

        dynamicArr.add(4.3d);
        dynamicArr.add("Ahmet Kaygisiz");
        dynamicArr.add(123.00f);
        dynamicArr.add("Data Structures");

        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.shrinkArray();
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.printArray();
        dynamicArr.removeAt(0);
        dynamicArr.printArray();
    }
    public static void uniLinkedList(){
        UniLinkedList<Integer> uniLinkedList = new UniLinkedList<Integer>();
        uniLinkedList.add(1);
        uniLinkedList.delete();
        uniLinkedList.print();

        uniLinkedList.add(2);
        uniLinkedList.add(3);
        uniLinkedList.add(4);
        uniLinkedList.add(5);
        uniLinkedList.add(6);
        uniLinkedList.add(7);
        uniLinkedList.add(8);
        uniLinkedList.add(9);

        System.out.println("Delete 3rd indexed element");
        uniLinkedList.deleteByIndex(3); // 3'ü sildi
        uniLinkedList.print();

        System.out.println("Delete 1st indexed element");
        uniLinkedList.deleteByIndex(1); // 1'i sildi
        uniLinkedList.print();

        System.out.println("Delete 7th indexed element");
        uniLinkedList.deleteByIndex(7);
        uniLinkedList.print();

        System.out.println("Delete last element");
        uniLinkedList.delete();
        uniLinkedList.print();

        System.out.println("delete unlisted element");
        uniLinkedList.deleteByIndex(-1);
        uniLinkedList.print();

        uniLinkedList.updateValueByIndex(2," 64 ");
        uniLinkedList.print();
    }
    public static void circularLinkedList(){
        CircularLinkedListImpl circularLinkedList = new CircularLinkedListImpl();
        circularLinkedList.add(3);
        circularLinkedList.add(5);
        circularLinkedList.add(12);
        circularLinkedList.add(9);

        circularLinkedList.delete();
        circularLinkedList.delete();
        circularLinkedList.delete();

        circularLinkedList.print();


    }
    public static void biLinkedList(){
        BiLinkedListImpl biLinkedList = new BiLinkedListImpl();
        biLinkedList.addEnd(6);
        biLinkedList.addHead(5);
        biLinkedList.addEnd(7);
        biLinkedList.addEnd(8);
        biLinkedList.addHead(4);

        biLinkedList.printForward();
        biLinkedList.deleteFromHead();
        biLinkedList.deleteFromTail();
        biLinkedList.printForward();

    }
    public static void stack(){
        StackImpl<Integer> stack = new StackImpl<Integer>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Poped top item : " + stack.pop());
        System.out.println("Top element : " + stack.peek());

        System.out.println(stack.popAll().stream().collect(Collectors.toList()));
    }
    public static void queueWArray(){
        QueueImplWithArray<Integer> qArr= new QueueImplWithArray<Integer>(5);
        qArr.enQueue(3);
        qArr.printQueue();
        qArr.deQueue();

        System.out.println("Front Element : " + qArr.front());
        System.out.println("-------------");

        qArr.enQueue(1);
        qArr.enQueue(2);
        qArr.enQueue(3);

        qArr.deQueue();

        System.out.println("Front Element : " + qArr.front());
        System.out.println("Queue Size : " + qArr.queueSize());
        System.out.println("-------------");

        qArr.printQueue();
    }
    public static void queueWLinkedList(){
        QueueImplWithLinkedList<Integer> qList= new QueueImplWithLinkedList<Integer>(5);
        qList.enQueue(3);
        qList.printQueue();
        qList.deQueue();

        System.out.println("Front Element : " + qList.front());
        System.out.println("-------------");

        qList.enQueue(1);
        qList.enQueue(2);
        qList.enQueue(3);
        qList.enQueue(4);
        qList.enQueue(5);
        qList.enQueue(6);

        qList.deQueue();
        qList.printQueue();
        System.out.println("Front Element : " + qList.front());
        System.out.println("Queue Size : " + qList.queueSize());
        System.out.println("-------------");

        qList.deQueue();
        qList.printQueue();
        System.out.println("Front Element : " + qList.front());
        System.out.println("Queue Size : " + qList.queueSize());
        System.out.println("-------------");

        qList.deQueue();
        qList.printQueue();
        System.out.println("Front Element : " + qList.front());
        System.out.println("Queue Size : " + qList.queueSize());
        System.out.println("-------------");

        qList.deQueue();
        qList.printQueue();
        System.out.println("Front Element : " + qList.front());
        System.out.println("Queue Size : " + qList.queueSize());
        System.out.println("-------------");

        qList.deQueue();
        qList.printQueue();
        System.out.println("Front Element : " + qList.front());
        System.out.println("Queue Size : " + qList.queueSize());
        System.out.println("-------------");

        qList.deQueue();
        qList.printQueue();
        System.out.println("Front Element : " + qList.front());
        System.out.println("Queue Size : " + qList.queueSize());
        System.out.println("-------------");

    }
    public static void hashtable(){
        Hashtable<Integer, String> hash_table =
                new Hashtable<Integer, String>();

        HashTableImpl h = new HashTableImpl(5);
        h.add("Ahmet");
        h.add("Mehmet");
        h.add("Test");
        h.add("Table");
        h.add("Hash");

        h.printHashTable();
        System.out.println("------");
        h.add("Table");
        h.add("Ahmet");
        h.add("Table");
        h.printHashTable();

        System.out.println("------");
        h.removeValue("Ahmet");
        h.removeValue("Hash");
        h.removeValue("Hash");
        h.printHashTable();
    }
    public static void binarySearchTree(){
        BinarySearchTreeImpl bst = new BinarySearchTreeImpl();

        bst.addNode(5);
        bst.addNode(1);
        bst.addNode(3);

        bst.addNode(6);
        bst.addNode(4);

        bst.searchValue(3);
        bst.deleteNode(3);
        bst.searchValue(3);

        bst.addNode(0);
        bst.addNode(-1);
        bst.addNode(8);
    }
}
