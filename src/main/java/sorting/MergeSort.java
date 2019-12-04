package sorting;

class MergeSort extends Sort {

    @Override
    void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int low, int high) {
        if (low >= high) return;

        if ((high - low) == 1) {
            if (array[low] > array[high]) {
                swap(array, low, high);
            }
            return;
        }

        int mid = (low + high) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        if (array[mid] > array[mid + 1]) merge(array, low, mid, high);
    }

    private void merge(int[] merged, int low, int mid, int high) {
        int k = low, i, j;
        int size = high - low + 1;

        int[] arr = new int[size];

        for (j = 0; j < size; j++)
            arr[j] = merged[low + j];

        i = 0;
        j = mid - low + 1;
        while (i <= mid - low && j <= arr.length - 1) {
            if (arr[i] <= arr[j]) merged[k++] = arr[i++];
            else merged[k++] = arr[j++];
        }

        while (i <= mid - low) merged[k++] = arr[i++];
        while (j <= arr.length - 1) merged[k++] = arr[j++];
    }
}
