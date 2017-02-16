package Algorytm.structures;

public interface MyListInterface {

    void add(int value);

    int get(int index);

    void add(int index, int value);

    void put(int index, int value);

    void addAll(MyListInterface myList);

    void addAll(int index, MyListInterface myList);

    void delete(int index);

    MyListInterface clone();

    int getSize();

}
