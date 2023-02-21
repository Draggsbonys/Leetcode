package Tree.MinimumDepthofBinaryTree;
// Link to task: https://leetcode.com/problems/minimum-depth-of-binary-tree/
/*
 * Для заданного бинарного дерева найти его минимальную глубину.
 * Минимальная глубина — это количество узлов на кратчайшем пути
 * От корневого узла до ближайшего конечного узла.
 *
 * Пример 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 *
 * Пример 2:
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 */
public class Node {
    int value;
    Node left;
    Node right;
    public Node(){

    }
    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node left, Node right) {
        this.value = value;
        this.right = right;
        this.left = left;
    }
    // Функция нахождения минимальной глубины дерева рекурсивным методом
    public int minDepth(Node root) {
        // Если корень дерева пуст, возвращаем 0, потому что пустое дерево не имеет глубины
        if (root == null) {
            return 0;
          // Если ветка left равна null возвращаем всю длину ветки right +1 за корневой узел
        }  else {
            // Накапливаем в переменную типа int все узлы ветки left
            int leftDepth = minDepth(root.left);
            // Накапливаем в переменную типа int все узлы ветки right
            int rightDepth = minDepth(root.right);
            // Сравниваем две переменные между собой и возвращаем минимальное значение +1 за корневой узел
            return Math.min(leftDepth, rightDepth)+1;
        }
    }
}
