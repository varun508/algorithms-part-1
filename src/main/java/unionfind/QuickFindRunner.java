package unionfind;

public class QuickFindRunner {
    public static void main(String[] args) {
        QuickFind quickFind = new QuickFind(10);

        quickFind.union(0, 7);
        quickFind.union(7, 3);
        quickFind.union(3, 9);

        System.out.println(quickFind.connected(7,9));

        quickFind.display();
    }
}
