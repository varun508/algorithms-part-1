package unionfind;

public class Runner {

    public static void main(String[] args) {
        run(new QuickFind(10));
        run(new QuickUnion(10));
    }

    private static void run(UnionFind unionFind) {
        unionFind.union(4, 3);
        unionFind.union(3, 8);
        unionFind.union(6, 5);
        unionFind.union(9, 4);
        unionFind.union(2, 1);
        unionFind.union(5, 0);
        unionFind.union(7, 2);
        unionFind.union(6, 1);
        unionFind.union(7, 3);

        unionFind.display();
    }
}
