package unionfind;

import unionfind.UnionFind;

public class QuickUnion extends UnionFind {

    QuickUnion(int size) {
        super(size);
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

    private int root(int i) {
        while (i != ids[i]) i = ids[i];
        return i;
    }
}
