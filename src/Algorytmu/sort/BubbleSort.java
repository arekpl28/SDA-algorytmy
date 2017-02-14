package Algorytmu.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = {1, 2, 3, 4, 5, 6, 8, 7};
        System.out.println(Arrays.toString(bubbleSort.ascSort(array)));
        System.out.println(Arrays.toString(bubbleSort.descSort(array)));

    }

    private void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public int[] descSort(int[] array) {
        int couter = 0;
        boolean flag;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                couter++;
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(couter);
        return array;
    }

    public int[] ascSort(int[] array) {
        int couter = 0;
        boolean flag;
        for (int i = 0; i < array.length; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                couter++;
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(couter);
        return array;
    }

}
