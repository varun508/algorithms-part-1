package unionfind.quickunion;

import java.util.Arrays;

public class QuickUnion implements IQuickUnion {

    private int[] ids;

    QuickUnion(int size) {
        ids = new int[size];
        init();
    }

    @Override
    public void init() {
        for (int i = 0; i < ids.length; i++) ids[i] = i;
    }

    @Override
    public int root(int i) {
        while (i != ids[i]) i = ids[i];
        return i;
    }

    @Override
    public void union(int p, int q) {
        int rootOfP = root(p);
        int rootOfQ = root(q);

        ids[rootOfP] = rootOfQ;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void display() {
        System.out.println(Arrays.toString(ids));
    }
}
