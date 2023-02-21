package Array.TwoSum;
public class Main {
    public static void main(String[] args) {
        int[] sum = new int[] {3,2,4};
        for (int i = 0; i < Task.twoSum(sum, 6).length; i++) {
            System.out.println(Task.twoSum(sum, 6)[i]);
        }
    }
}
