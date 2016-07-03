import java.util.Scanner;

public class Q_1002 {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        int loopCount = Integer.parseInt(scInput.nextLine());
        while (loopCount-- > 0) {
            int x1, y1, r1, x2, y2, r2;
            x1 = scInput.nextInt();
            y1 = scInput.nextInt();
            r1 = scInput.nextInt();
            x2 = scInput.nextInt();
            y2 = scInput.nextInt();
            r2 = scInput.nextInt();
            if ((x1 == x2) && (y1 == y2) && (r1 == r2)) {
                // 마린이 있을 수 있는 위치가 무한대
                System.out.println(-1);
            } else if ((x1 == x2) && (y1 == y2)) {
                // 마린이 있을 수 있는 위치가 없음
                System.out.println(0);
            } else {
                double fromR1toR2 = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
                double shortLine = r1;
                double longLine = r2;
                double middleLine = fromR1toR2;
                if (r1 > r2) {
                    shortLine = r2;
                    longLine = r1;
                }
                if (middleLine < shortLine) {
                    middleLine = shortLine;
                    shortLine = fromR1toR2;
                } else if (middleLine > longLine) {
                    middleLine = longLine;
                    longLine = fromR1toR2;
                }
                if (shortLine+middleLine > longLine) {
                    // 마린이 있을 수 있는 위치가 두 개
                    System.out.println(2);
                } else if (shortLine+middleLine == longLine) {
                    // 마린이 있을 수 있는 위치가 단 하나
                    System.out.println(1);
                } else if (shortLine+middleLine < longLine) {
                    // 마린이 있을 수 있는 위치가 없음
                    System.out.println(0);
                }
            }
        }
    }
}