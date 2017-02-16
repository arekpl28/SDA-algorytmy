package test.algorytmy.structures;


import algorytm.structures.MyList;
import algorytm.structures.MyListInterface;

public class MyListTest {
    public static void main(String[] args) {
        MyListInterface myList = initMyList();
        MyListInterface clonedList = myList.clone();
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.add(5);
        clonedList.add(2);
        clonedList.add(3);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.delete(0);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.add(4, 42);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();
        clonedList.put(3, 222);
        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();

    }

    private static MyList initMyList() {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(1);
        myList.add(1);
        myList.add(-2);
        myList.add(3);
        myList.add(4);
        myList.add(0);
        myList.add(0);
        myList.add(0);
        myList.add(7);
        myList.add(5);
        myList.add(5);
        myList.add(5);
        myList.add(5);
        return myList;
    }
}
