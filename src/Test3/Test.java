package Test3;
import java.math.BigInteger;

public class Test {
    public String addBinary(String a, String b) {
        BigInteger firstBigInteger = new BigInteger(a,2);
        BigInteger secondBigInteger = new BigInteger(b,2);

        BigInteger sum = firstBigInteger.add(secondBigInteger);
        String result = sum.toString(2);
        return result;
    }
}
