package sorting;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        System.out.print("Selection Sort: ");
        run(new SelectionSort());

        System.out.print("Insertion Sort: ");
        run(new InsertionSort());

        System.out.print("Shell Sort: ");
        run(new ShellSort());

        System.out.print("Merge Sort: ");
        run(new MergeSort());

        System.out.print("Quick Sort: ");
        run(new QuickSort());
    }

    private static void run(Sort algorithm) {
        int size = 10000;
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = size - i;

        long start = System.currentTimeMillis();
        algorithm.sort(array);
        long end = System.currentTimeMillis();

        System.out.print(Arrays.toString(array));
        System.out.println("\n   Took " + (end - start) + " ms");
    }
}
