package unionfind.quickfind;

public class QuickFindRunner {
    public static void main(String[] args) {
        QuickFind quickFind = new QuickFind(10);

        quickFind.union(0, 7);
        quickFind.union(7, 3);
        quickFind.union(3, 9);

        quickFind.display();
    }
}
