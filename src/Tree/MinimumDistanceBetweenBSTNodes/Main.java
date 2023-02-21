package Tree.MinimumDistanceBetweenBSTNodes;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1,
                null,
                new Node(5,
                        new Node(3),
                        null));

        System.out.println(root.minimumDistance(root.arrayOfTree(root)));
    }
}
