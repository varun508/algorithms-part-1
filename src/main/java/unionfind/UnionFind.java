package unionfind;

import java.util.Arrays;

public abstract class UnionFind {

    int[] ids;

    UnionFind(int size) {
        ids = new int[size];
        init();
    }

    private void init() {
        for (int i = 0; i < ids.length; i++) ids[i] = i;
    }

    void display() {
        System.out.println(Arrays.toString(ids));
    }

    abstract public void union(int p, int q);

    abstract public boolean connected(int p, int q);
}
