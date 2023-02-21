package Tree.MaximumDepthofBinaryTree;

public class Main {
    public static void main(String[] args) {
        // Создаем бинарное дерево
        Node root =
                new Node(3,
                        new Node(9),
                        new Node(20,
                                new Node(15),
                                new Node(7)));

        System.out.println("Максимальная глубина дерева: " + root.maxDepth(root));
    }
}
