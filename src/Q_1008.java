import java.util.Scanner;

public class Q_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.nextLine();
        String[] splitInputValue = inputValue.split(" ");
        Integer quotient = Integer.parseInt(splitInputValue[0]) / Integer.parseInt(splitInputValue[1]);
        Integer remainder = Integer.parseInt(splitInputValue[0]) % Integer.parseInt(splitInputValue[1]);
        String returnValue = quotient + ".";
//        System.out.println("quotient : "+quotient+"  "+"remainder : "+remainder);
        Integer MIN_POINT_NUMBER = 9;
        Integer MAX_POINT_NUMBER = 32;
        String quotientSet = "";
        while (quotientSet.length() < MAX_POINT_NUMBER ) {
            quotient = ((remainder * 10) / Integer.parseInt(splitInputValue[1]));
            remainder = ((remainder * 10) % Integer.parseInt(splitInputValue[1]));
            quotientSet += quotient + "";
//            System.out.println(quotientSet);
            if (quotientSet.length() >= MIN_POINT_NUMBER) {
                break;
            }
        }
            System.out.println(returnValue + quotientSet);
    }
}