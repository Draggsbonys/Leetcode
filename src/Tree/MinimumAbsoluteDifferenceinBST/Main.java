package Tree.MinimumAbsoluteDifferenceinBST;
import Tree.MinimumAbsoluteDifferenceinBST.*;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1,
                new Node(0),
                new Node(48,
                        new Node(12),
                        new Node(49)));

        System.out.println(root.getMinimumDifference(root));
    }
}

