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
    }

    private static void run(Sort algorithm) {
        int[] array = new int[10000];

        for (int i = 0; i < 10000; i++)
            array[i] = 10000 - i;

        long start = System.currentTimeMillis();
        algorithm.sort(array);
        long end = System.currentTimeMillis();

        System.out.println(Arrays.toString(array) + "\n   Took " + (end - start) + " ms");
    }
}
