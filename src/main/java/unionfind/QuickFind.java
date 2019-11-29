package unionfind;

public class QuickFind implements IQuickFind {

    private int[] ids;

    public QuickFind(int size) {
        ids = new int[size];
        init();
    }

    @Override
    public void init() {
        for (int i = 0; i < ids.length; i++) ids[i] = i;
    }

    @Override
    public void union(int p, int q) {

    }

    @Override
    public boolean connected(int p, int q) {
        return false;
    }
}
