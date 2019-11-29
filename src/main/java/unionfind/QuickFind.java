package unionfind;

public class QuickFind extends UnionFind {

    QuickFind(int size) {
        super(size);
    }

    @Override
    public void union(int p, int q) {
        if (!connected(p, q)) {
            int itemAtP = ids[p];
            int itemAtQ = ids[q];

            for (int i = 0; i < ids.length; i++) {
                if (ids[i] == itemAtP)
                    ids[i] = itemAtQ;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return ids[p] == ids[q];
    }
}
