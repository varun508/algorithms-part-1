package sorting;

public abstract class Sort {
    abstract int[] sort(int[] array);

    int[] shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 10) % array.length;
            int temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }
        return array;
    }
}
