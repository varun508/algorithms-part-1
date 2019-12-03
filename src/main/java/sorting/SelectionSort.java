package sorting;

class SelectionSort extends Sort {

    @Override
    void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(array, i, min);
            }
        }
    }
}
