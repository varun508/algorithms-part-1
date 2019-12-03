package sorting;

class InsertionSort extends ShellSort {

    @Override
    void sort(int[] array) {
        int i = 0, j = 0;
        while (i != array.length) {
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
            j = ++i;
        }
    }
}
