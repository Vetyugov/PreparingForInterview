package Lesson2;

import Lesson2.ArrayList.MyArrayList;
import Lesson2.LinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        //Провека связного списка
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.add("890");
        myLinkedList.add("qwe");
        myLinkedList.add("891");
        myLinkedList.add("892");
        myLinkedList.add("893");

        System.out.println("Before remove: " + myLinkedList);

        myLinkedList.remove("892");
        myLinkedList.remove("890");

        System.out.println("After remove (892 and 890): " + myLinkedList);


//        Проверка ArrayList
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("asa");
        myArrayList.add("123");
        System.out.println(myArrayList);
        myArrayList.set(0,"545");
        System.out.println(myArrayList);
        myArrayList.remove(1);
        System.out.println(myArrayList);
    }
}
