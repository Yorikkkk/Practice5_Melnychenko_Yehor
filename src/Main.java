import java.util.Arrays;

public class Main {

    public static void insertionSortDescending(short[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            short current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void bubbleSortDescending(short[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    short temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        short[] originalArray = {15, -4, 42, 0, 108, 23, -19, 42, 7};

        short[] arrayForInsertion = Arrays.copyOf(originalArray, originalArray.length);
        short[] arrayForBubble = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Початковий масив: " + Arrays.toString(originalArray));
        System.out.println("--------------------------------------------------");

        insertionSortDescending(arrayForInsertion);
        System.out.println("Insertion sort (по спаданню): " + Arrays.toString(arrayForInsertion));

        bubbleSortDescending(arrayForBubble);
        System.out.println("Bubble sort (по спаданню):    " + Arrays.toString(arrayForBubble));
    }
}