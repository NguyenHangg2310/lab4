package Lab4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        selectionSort(array);
        System.out.print(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
    }
}
