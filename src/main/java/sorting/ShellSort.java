package sorting;

class ShellSort extends Sort {

    @Override
    void sort(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            int i = 0, j = gap;
            while (j < array.length) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                    int n = i;
                    while ((n - gap) >= 0 && array[n - gap] > array[n]) {
                        swap(array, n - gap, n);
                        n -= gap;
                    }
                }
                i++;
                j++;
            }
            gap /= 2;
        }
    }
}
