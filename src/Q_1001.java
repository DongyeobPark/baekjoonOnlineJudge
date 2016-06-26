import java.util.Scanner;

public class Q_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.nextLine();
        String[] splitInputValue = inputValue.split(" ");
        System.out.println(Integer.parseInt(splitInputValue[0]) - Integer.parseInt(splitInputValue[1]));
    }
}