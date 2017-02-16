package algorytm.sort;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
        CountSort countSort = new CountSort();
        int[] array = {-2, -5, 3, 4, 1, 0, 0, 0, -3, 5, 3};
        System.out.println(Arrays.toString(countSort.ascSort(array)));


    }

    public int[] ascSort(int[] array) {
        int max = SortUtils.max(array);
        int min = SortUtils.min(array);
        int range = max - min + 1;
        int[] rangeArray = new int[range];
        for (int i = 0; i < array.length; i++) {
            rangeArray[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < rangeArray.length; i++) {
            for (int j = 0; j < rangeArray[i]; j++) {
                array[index] = i + min;
                index++;
            }
        }
        return array;
    }

}
