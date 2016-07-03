import java.util.Scanner;

public class Q_1003 {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        long loopCount = Integer.parseInt(scInput.nextLine());
        while (loopCount-- > 0) {
            long inputValue = Integer.parseInt(scInput.nextLine());
            if (inputValue == 0) {
                System.out.println("0 1");
            } else if (inputValue == 1) {
                System.out.println("1 0");
            } else if (inputValue == 2) {
                System.out.println("1 1");
            } else {
                long oneCount = 1;
                long zeroCount = 1;
                long beforeOneCount = 0;
                while (inputValue-- >= 3) {
                    zeroCount = zeroCount + oneCount;
                    long countTemp = oneCount;
                    oneCount = oneCount + beforeOneCount;
                    beforeOneCount = countTemp;
                }
                System.out.println(oneCount + " " + zeroCount);
            }
        }
    }
}