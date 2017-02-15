package Algorytmu.structures;

public class MyList {

    private int[] array;
    private final int INITIAL_SIZE = 10;
    private int size;

    public MyList() {
        this.array = new int[INITIAL_SIZE];
        this.size = 0;

    }

    public void put(int index, int value) {
        if (checkIndex(index)) {
            this.array[index] = value;
        }
    }

    public void add(int index, int value) {
        if (checkIndex(index)) {
            if (this.size >= array.length) {
                doubleCapacity();
            }
            for (int i = this.size; i > index; i--) {
                this.array[i] = this.array[i - 1];
            }
            this.size++;
            this.array[index] = value;
        }
    }

    public int get(int index) {
        if (checkIndex(index)) {
            return array[index];
        } else {
            System.out.println("Wrong index");
            return 0;
        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    public void add(int value) {
        if (size == array.length) {
            doubleCapacity();
        }
        array[size] = value;
        size++;
    }

    private void swap(int i1, int i2) {
        int tmp = this.array[i1];
        this.array[i1] = this.array[i2];
        this.array[i2] = tmp;
    }

    public void delete(int index) {
        if (checkIndex(index)) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public MyList clone() {
        MyList myList = new MyList();
        myList.array = rewrite(new int[this.array.length]);
        myList.size = this.size;
        return myList;
    }

    private void doubleCapacity() {
        int[] tmpArray = new int[size * 2];
        this.array = rewrite(tmpArray);
    }

    private int[] rewrite(int[] tmpArray) {
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = this.array[i];
        }
        return tmpArray;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
