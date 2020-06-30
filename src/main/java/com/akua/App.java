package com.akua;

import com.akua._01_dynamic_array.DynamicArray;
import com.akua._02_linkedlist_uni.CustomLinkedList;
import com.akua._03_stack.StackImpl;
import com.akua._04_queue.QueueImplWithArray;
import com.akua._04_queue.QueueImplWithLinkedList;
import com.akua._05_hash_table.HashTableImpl;

import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        // dynamicArray();
        // customLinkedList();
        // stack();
        // queueWArray();
        // queueWLinkedList();
        hashtable();
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
    }
    public static void customLinkedList(){
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<Integer>();
        customLinkedList.add(1);
        customLinkedList.add(2);
        customLinkedList.add(3);
        customLinkedList.add(4);
        customLinkedList.add(5);
        customLinkedList.add(6);
        customLinkedList.add(7);
        customLinkedList.add(8);
        customLinkedList.add(9);

        System.out.println("Delete 3rd indexed element");
        customLinkedList.deleteByIndex(3); // 3'ü sildi
        customLinkedList.print();

        System.out.println("Delete 1st indexed element");
        customLinkedList.deleteByIndex(1); // 1'i sildi
        customLinkedList.print();

        System.out.println("Delete 7th indexed element");
        customLinkedList.deleteByIndex(7);
        customLinkedList.print();

        System.out.println("Delete last element");
        customLinkedList.delete();
        customLinkedList.print();

        System.out.println("delete unlisted element");
        customLinkedList.deleteByIndex(-1); // Burada bir sıkıntı var.
        customLinkedList.print();

        customLinkedList.updateValueByIndex(2," 64 ");
        customLinkedList.print();
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
        HashTableImpl h = new HashTableImpl(5);
        h.add(5);
        h.add(6);
        h.add(1);
        h.add(6);
        h.add(1);
        h.add(6);
        h.add(7);
        h.add(1);
        h.add(7);
        h.add(7);

        h.printHashTable();
    }
}
