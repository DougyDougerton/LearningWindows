import java.util.Scanner;

public class booleanScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cookie = false;
        boolean validInput = false;

        while(!validInput) {
            System.out.print("Would you like a cookie? (yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if(input.equals("yes")) {
                cookie = true;
                validInput = true;
            } else if(input.equals("no")) {
                cookie = false;
                validInput = true;
            } else {
                System.out.println("Please select yes, or no.");
            }
        }
        if(cookie) {
            System.out.println("You get a cookie!");
        } else {
            System.out.println("No cookie for you!");
        }
        scanner.close();
    }
}
