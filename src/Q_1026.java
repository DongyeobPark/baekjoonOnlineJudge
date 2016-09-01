import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        Integer[] aArray = new Integer[arraySize];
        Integer[] bArray = new Integer[arraySize];
        for (int i=0; i<arraySize; i++) {
            aArray[i] = sc.nextInt();
        }
        for (int i=0; i<arraySize; i++) {
            bArray[i] = sc.nextInt();
        }
        Arrays.sort(aArray);
        Arrays.sort(bArray, Collections.reverseOrder());
        int returnValue = 0;
        for (int i=0; i<arraySize; i++) {
            returnValue += aArray[i] * bArray[i];
        }
        System.out.println(returnValue);
    }
}