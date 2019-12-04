package sorting;

class QuickSort extends Sort {

    @Override
    void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int from, int to) {
        if (to <= from) return;
        int sorted = partition(array, from, to);
        sort(array, from, sorted - 1);
        sort(array, sorted + 1, to);
    }

    private int partition(int[] array, int from, int pivot) {
        int i = from, j = from + 1;

        while (j < pivot) {
            if (array[j] < array[pivot]) {
                swap(array, i, j);
                i++;
            }
            j++;
        }
        if (array[i] > array[j])
            swap(array, i, j);
        return i;
    }
}
