package unionfind;

public interface IUnionFind {

    void init();

    void union(int p, int q);

    boolean connected(int p, int q);

    void display();
}
