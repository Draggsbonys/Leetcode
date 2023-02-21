package Tree.MinimumAbsoluteDifferenceinBST;
import java.util.Stack;
import java.util.ArrayList;
// Link to task: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
/*
 * Учитывая корень двоичного дерева поиска (BST), вернуть минимальную
 * Aбсолютную разницу между значениями любых двух разных узлов в дереве.
 */
public class Node {
    int value;
    Node left, right;
    Node(){};
    Node(int value){this.value = value;}
    Node(int value, Node left, Node right){this.value = value; this.left = left; this.right = right;}

    ArrayList<Integer> list = new ArrayList<>();
    // Итерационная функция для обхода дерева в обратном порядке
    public int getMinimumDifference(Node root) {
        if (root == null) {
            return 0;
        }
        // Создаем пустой stack и помещаем в него корневой узел
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        // Создаем еще один stack для хранения обхода в обратном порядке
        Stack<Integer> out = new Stack<>();

        // Цикл до тех пор, пока stack не станет пустым
        while(!stack.empty()) {
            // Извлекаем узел из stack и помещаем данные в выходной стек
            Node curr = stack.pop();
            out.push(curr.value);
            // Помещаем в stack левый и правый дочерние элементы извлеченного узла
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        // Добавляем элементы обхода в список
        while(!out.empty()) {
            list.add(out.pop());
        }
        // Сортируем список в порядке убывания
        int container = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    container = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,container);
                }
            }
        }
        // Находим наименьшую разницу двух любых узлов дерева
        int container2 = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j) && container2 > list.get(i) - list.get(j)) {
                    container2 = list.get(i) - list.get(j);
                }
            }
        }
        return container2;
    }
}
