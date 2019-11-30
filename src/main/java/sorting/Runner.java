package sorting;

import java.util.Arrays;

public class Runner {

    private static int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        run(new SelectionSort());
    }

    private static void run(Sort algorithm) {
        int[] sorted = algorithm.sort(array);
        System.out.println(Arrays.toString(sorted));
    }
}
