package test.algorytmy.structures;


import algorytm.structures.MyLinkedList;
import algorytm.structures.MyListInterface;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyListInterface myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(5);
        System.out.println(myLinkedList.get(0));
        myLinkedList.add(3);
        myLinkedList.add(-1);
        myLinkedList.add(4);
        myLinkedList.add(2);
        System.out.println(myLinkedList);
        myLinkedList.delete(2);
        System.out.println(myLinkedList);


    }
}
