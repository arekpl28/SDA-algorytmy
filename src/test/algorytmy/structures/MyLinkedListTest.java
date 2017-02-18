package test.algorytmy.structures;


import algorytm.structures.MyLinkedList;
import algorytm.structures.MyList;
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
        myLinkedList.put(2, 333);
        System.out.println(myLinkedList);
        MyListInterface someList = new MyList();
        someList.add(2);
        someList.add(3);
        someList.add(-1);
        System.out.println();

        System.out.println("Before and after adding some list");
        System.out.println(myLinkedList);
        myLinkedList.addAll(someList);
        System.out.println(myLinkedList);
        System.out.println();

        MyListInterface clonedList = myLinkedList.clone();
        clonedList.delete(2);
        System.out.println("After removing value from cloned list");
        System.out.println(myLinkedList);
        System.out.println(clonedList);
        System.out.println();

        System.out.println("Before and adding element on index 2");
        System.out.println(myLinkedList);
        myLinkedList.add(2, 555);
        System.out.println(myLinkedList);
        myLinkedList.add(0, 444);
        System.out.println(myLinkedList);

        System.out.println("Before and after adding all into");
        System.out.println(myLinkedList);
        myLinkedList.addAll(2, someList);
        System.out.println(myLinkedList);

    }
}
