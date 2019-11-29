package unionfind.quickfind;

import unionfind.IUnionFind;
import unionfind.quickunion.IQuickUnion;

public class QuickFind implements IUnionFind {

    private int[] ids;

    QuickFind(int size) {
        ids = new int[size];
        init();
    }

    @Override
    public void init() {
        for (int i = 0; i < ids.length; i++) ids[i] = i;
    }

    @Override
    public void union(int p, int q) {
        if (!connected(p, q)) {
            int itemAtP = ids[p];
            int itemAtQ = ids[q];

            for (int i = 0; i < ids.length; i++) {
                if (ids[i] == itemAtP) ids[i] = itemAtQ;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return ids[p] == ids[q];
    }

    @Override
    public void display() {
        for (int id : ids) {
            System.out.print(id + ", ");
        }
    }
}
