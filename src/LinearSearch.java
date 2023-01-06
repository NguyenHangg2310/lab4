package Lab4;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 5, 3};
        int key1 = 9;
        int key2 = 10;
        System.out.println(linearSearchIndex(array, key1));
        System.out.println(linearSearchIndex(array, key2));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        if (linearSearch(array, key)) {
            for (int i = 0; i < array.length; i++) {
                return i;
            }
        }
        return -1;
    }
}
