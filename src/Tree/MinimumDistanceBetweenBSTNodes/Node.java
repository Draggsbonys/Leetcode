package Tree.MinimumDistanceBetweenBSTNodes;

import java.util.ArrayList;

// Link to task: https://leetcode.com/problems/minimum-distance-between-bst-nodes/
/*
 * Учитывая корень двоичного дерева поиска (BST),
 * Вернуть минимальную разницу между значениями любых двух разных узлов в дереве.
 */
public class Node {
    int value;
    Node left;
    Node right;
    Node(){};
    Node(int value){this.value = value;}
    Node(int value, Node left, Node right){this.value = value;this.left = left;this.right=right;}
    ArrayList<Integer> list = new ArrayList<>();

    // Метод сортировки массива
    public ArrayList sortList(ArrayList <Integer> list) {
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
        return list;
    }
    // Метод приведения дерева в список
    public ArrayList arrayOfTree (Node root) {
        list.add(root.value);
        if (root.left != null){
            arrayOfTree(root.left);
        }
        if (root.right != null) {
            arrayOfTree(root.right);
        }
        return sortList(list);
    }
    // Метод нахождения минимальной разницы
    public int minimumDistance (ArrayList<Integer> list) {
        int container = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j) && container > list.get(i)-list.get(j)) {
                        container = (list.get(i)-list.get(j));
                }
            }
        }
        return container;
    }
}
