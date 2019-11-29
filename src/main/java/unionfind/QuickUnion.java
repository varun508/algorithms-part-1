package unionfind;

public class QuickUnion extends UnionFind {

    private int[] sizes;

    QuickUnion(int size) {
        super(size);
        sizes = new int[size];
        for (int i = 0; i < size; i++) sizes[i] = 1;
    }

    @Override
    public void union(int p, int q) {
        int rootOfP = root(p);
        int rootOfQ = root(q);

        if (sizes[rootOfP] >= sizes[rootOfQ]) {
            ids[rootOfQ] = rootOfP;
            sizes[p] += sizes[q];
        } else {
            ids[rootOfP] = rootOfQ;
            sizes[q] += sizes[p];
        }
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
