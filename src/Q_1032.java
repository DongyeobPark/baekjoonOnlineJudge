import java.util.Scanner;

public class Q_1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopCount = sc.nextInt();
        String standardName = "";
        String matchPattern = "";
        String matchResult = "";
        for (int i = 0; i < loopCount; i++) {
            if (i == 0) {
                standardName = sc.next();
//                System.out.println("-> "+standardName);
            } else {
                matchPattern = sc.next();
//                System.out.println("-> "+matchPattern);
                matchResult = "";
                for (int t = 0; t < standardName.length(); t++) {
                    if (standardName.charAt(t) != matchPattern.charAt(t)) {
//                        System.out.println(standardName.charAt(t));
                        matchResult += "?";
                    } else {
                        matchResult += standardName.charAt(t);
                    }
                }
                standardName = matchResult;
            }
        }
        System.out.println(standardName);
    }
}