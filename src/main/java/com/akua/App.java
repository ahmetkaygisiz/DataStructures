package com.akua;

import com.akua._01_dynamic_array.DynamicArray;
import com.akua._02_linked_list.CustomLinkedList;

public class App {
    public static void main(String[] args){
        // dynamicArray();
        // customLinkedList();
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
}
