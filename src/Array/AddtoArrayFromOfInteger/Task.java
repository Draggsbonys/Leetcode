package Array.AddtoArrayFromOfInteger;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
// Link to task: https://leetcode.com/problems/add-to-array-form-of-integer/
/*
* Массивная форма целого числа представляет собой массив, представляющий
* Его цифры в порядке слева направо. Например, для num = 1321 форма массива будет [1,3,2,1].
* Учитывая num, форму массива целого числа и целое число k, вернуть форму массива целого числа num + k.
*
* Пример 1:
* Input: num = [1,2,0,0], k = 34
* Output: [1,2,3,4]
* Explanation: 1200 + 34 = 1234
*
* Пример 2:
* Input: num = [2,7,4], k = 181
* Output: [4,5,5]
* Explanation: 274 + 181 = 455
*
* Пример 3:
* Input: num = [2,1,5], k = 806
* Output: [1,0,2,1]
* Explanation: 215 + 806 = 1021
*/
public class Task {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();

        StringBuilder container = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            container.append(num[i]);
        }
        String numberString = container.toString();
        BigInteger numberInt = new BigInteger(numberString);
        BigInteger numberK = new BigInteger(String.valueOf(k));
        BigInteger numberInteger = numberInt.add(numberK);

        StringBuilder finalContainer = new StringBuilder();
        numberString = numberInteger.toString();

        finalContainer.append(numberString);
        System.out.println(finalContainer);

        for (int i = 0; i < finalContainer.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(finalContainer.charAt(i));
            String str = sb.toString();
            int num1 = Integer.parseInt(str);
            list.add(i, num1);
        }
        return list;
    }
}
