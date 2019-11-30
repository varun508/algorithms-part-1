package sorting;

public class InsertionSort extends Sort {

    @Override
    int[] sort(int[] array) {
        int i = 0, j = 0;
        while (i != array.length) {
            while (j > 0 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
            j = ++i;
        }
        return array;
    }
}
