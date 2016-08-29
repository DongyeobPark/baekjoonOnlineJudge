import java.math.BigInteger;
import java.util.Scanner;

public class Q_1003 {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        int loopCount = Integer.parseInt(scInput.nextLine());
        while (loopCount-- > 0) {
            BigInteger inputValue = new BigInteger(scInput.nextLine());
            if (inputValue.compareTo(new BigInteger("0")) == 0) {
                System.out.println("1 0");
            } else if (inputValue.compareTo(new BigInteger("1")) == 0) {
                System.out.println("0 1");
            } else if (inputValue.compareTo(new BigInteger("2")) == 0) {
                System.out.println("1 1");
            } else {
                BigInteger oneCount = new BigInteger("1");
                BigInteger zeroCount = new BigInteger("1");
                BigInteger beforeOneCount = new BigInteger("0");
                while (inputValue.compareTo(new BigInteger("2")) == 1) {
                    zeroCount = zeroCount.add(oneCount);
                    BigInteger countTemp = oneCount;
                    oneCount = oneCount.add(beforeOneCount);
                    beforeOneCount = countTemp;
                    inputValue = inputValue.subtract(BigInteger.valueOf(1));
                }
                System.out.println(oneCount + " " + zeroCount);
            }
        }
    }
}