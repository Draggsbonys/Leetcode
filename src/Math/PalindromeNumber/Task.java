package Math.PalindromeNumber;
// Link to task: https://leetcode.com/problems/palindrome-number/
/*
 * Учитывая целое число x, вернуть true, если x является палиндром , и false в противном случае.
 * Пример 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Пример 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Пример 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/
public class Task {
    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        sb.append(x);
        OUTER:
        for (int i = 0; i < sb.length(); i++) {
            INNER:
            for (int j = sb.length()-(i+1); j >= i; j--) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    b = true;
                    break INNER;
                } else {
                    b = false;
                    break OUTER;
                }
            }
        }
        return b;
    }
}
