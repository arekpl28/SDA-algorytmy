package test.algorytmy.structures;


import algorytm.structures.MyLinkedList;
import algorytm.structures.MyListInterface;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyListInterface myListInterface =new MyLinkedList();
        System.out.println(myListInterface.get(0));
        myListInterface.add(5);
        System.out.println(myListInterface.get(0));
    }
}
