import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);

        while (!str.equalsIgnoreCase("Exit")) {
            System.out.print("Please enter something: ");
            str = scanner.nextLine();
            System.out.printf(str.equalsIgnoreCase("Exit") ?
                    "You finally wrote \"%s\"" : "You wrote \"%s\"\n", str);
        }
    }
}