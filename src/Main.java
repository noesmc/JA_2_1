import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter something: ");
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("Exit")) {
                System.out.print("You finally wrote \"Exit\"");
                break;
            }
        }
    }
}