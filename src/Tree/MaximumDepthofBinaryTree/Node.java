package Tree.MaximumDepthofBinaryTree;
// Link to task: https://leetcode.com/problems/maximum-depth-of-binary-tree/
/*
 * Учитывая корень бинарного дерева, вернуть его максимальную глубину.
 * Максимальная глубина бинарного дерева — это количество узлов
 * На самом длинном пути от корневого узла до самого дальнего конечного узла.
 *
 * Пример 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 *
 * Пример 2:
 * Input: root = [1,null,2]
 * Output: 2
 */
public class Node {
    int value;
    Node left;
    Node right;
    public Node(){}
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node left, Node right) {
        this.value = value;
        this.right = right;
        this.left = left;
    }
    // Функция нахождения максимальной глубины дерева рекурсивным методом
    public int maxDepth(Node root) {
        // Если корень дерева пуст, возвращаем 0, потому что пустое дерево не имеет глубины
        if (root == null) {
            return 0;
        } else {
            // Накапливаем в переменную типа int все узлы ветки left
            int leftDepth = maxDepth(root.left);
            // Накапливаем в переменную типа int все узлы ветки right
            int rightDepth = maxDepth(root.right);
            // Сравниваем две переменные между собой и возвращаем максимальное значение +1 за корневой узел
            return Math.max(leftDepth, rightDepth)+1;
        }
    }
}
