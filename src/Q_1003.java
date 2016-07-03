import java.util.Scanner;

public class Q_1003 {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        int loopCount = Integer.parseInt(scInput.nextLine());
        while (loopCount-- > 0) {
            int[] answerList = fibonacci(scInput.nextInt(), 0, 0);
            System.out.println(answerList[1] + " " + answerList[2]);
        }
    }

    public static int[] fibonacci(int n, int zeroCount, int oneCount) {
        if (n == 0) {
            // System.out.println("0");
            return (new int[] {0, ++zeroCount, oneCount});
        } else if (n == 1) {
            // System.out.println("1");
            return (new int[] {1, zeroCount, ++oneCount});
        } else {
            int[] fibo1 = fibonacci(n-1, zeroCount, oneCount);
            int[] fibo2 = fibonacci(n-2, zeroCount, oneCount);
            return (new int[] {fibo1[0] + fibo2[0], (fibo1[1] + fibo2[1]), (fibo1[2] + fibo2[2])});
        }
    }
}