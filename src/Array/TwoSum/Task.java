package Array.TwoSum;
// Link to task: https://leetcode.com/problems/two-sum/
/*
 * Учитывая массив целых чисел nums и целочисленное целевое значение, верните индексы двух чисел так,
 * Чтобы в сумме они составляли целевое значение. Вы можете предположить, что каждый вход будет иметь ровно одно решение,
 * И вы не можете использовать один и тот же элемент дважды. Вы можете вернуть ответ в любом порядке.
 *
 * Пример 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Пример 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Пример 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Task {
    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        OUTER:
        for (int i = 0; i < nums.length; i++) {
            INNER:
            for (int j = i; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    if (j == i) {
                        continue INNER;
                    }
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }
}
