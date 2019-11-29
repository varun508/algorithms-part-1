package unionfind;

public interface IQuickFind {

    void init();

    void union(int p, int q);

    boolean connected(int p, int q);
}
