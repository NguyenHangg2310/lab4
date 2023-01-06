package Lab4;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(array, 5));
        System.out.println(binarySearch(array, 7));
        System.out.println(binarySearch(array, 12));

    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        int middleIdx = (fromIdx + toIdx) / 2;
        if (fromIdx > toIdx) {
            return false;
        }
        if (array[middleIdx] == key) {
            return true;
        } else if (array[middleIdx] > key) {
            toIdx = middleIdx - 1;
        } else {
            fromIdx = middleIdx + 1;
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }
}
