package sorting;

class MergeSort extends Sort {

    @Override
    void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    private void merge(int[] merged, int low, int mid, int high) {
        int k = low, i, j;
        int sizeOfArr1 = mid - low + 1;
        int sizeOfArr2 = high - mid;

        int[] arr1 = new int[sizeOfArr1];
        int[] arr2 = new int[sizeOfArr2];

        for (i = 0; i < sizeOfArr1; i++)
            arr1[i] = merged[low + i];

        for (j = 0; j < sizeOfArr2; j++)
            arr2[j] = merged[mid + j + 1];

        i = 0;
        j = 0;
        while (i < sizeOfArr1 && j < sizeOfArr2) {
            if (arr1[i] <= arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }

        while (i < sizeOfArr1) merged[k++] = arr1[i++];
        while (j < sizeOfArr2) merged[k++] = arr2[j++];
    }
}
