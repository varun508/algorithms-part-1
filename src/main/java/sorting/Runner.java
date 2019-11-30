package sorting;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        System.out.print("Selection Sort: ");
        run(new SelectionSort());

        System.out.print("Insertion Sort: ");
        run(new InsertionSort());

    }

    private static void run(Sort algorithm) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        long start = System.nanoTime();
        algorithm.sort(array);
        long end = System.nanoTime();

        System.out.println(Arrays.toString(array) + "   Took " + (end - start) + " ns");
    }
}
