package tree;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
    }

    void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    boolean contains(int value) {
        if (value == data) {
            return true;
        }
        if (left != null && value < data) {
            return left.contains(data);
        }
        if (right != null && value > data) {
            return right.contains(data);
        }
        return false;
    }

    void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }

        System.out.println(data + ", ");

        if (right != null) {
            right.printInOrder();
        }
    }


    boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBST(Node root, int min, int max) {
        if (left != null && right != null) {
            return checkBST(left, min, data - 1) && checkBST(right, data + 1, max);
        }
        return data >= min && data <= max;
    }
}
