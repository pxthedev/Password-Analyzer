import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordVerification passwordVerification = new PasswordVerification();
        System.out.println("Enter a password to test:");
        String passwordToTest = sc.nextLine(); // Read password from user input
        if (passwordToTest == null || passwordToTest.isEmpty()) {
            System.out.println("Password cannot be empty.");
            return;
        } else if (passwordToTest.length() < 6) {
            System.out.println("Password must be at least 6 characters long.");
            return;

        } else if (passwordToTest.length() > 20) {
            System.out.println("Password cannot exceed 20 characters.");
            return;
        } else {
            boolean isValid = passwordVerification.validar(passwordToTest);
            String message = isValid ? "Password is valid" : "Password is not valid";
            PasswordResults results = new PasswordResults(isValid, message);
            System.out.println("Password: " + passwordToTest);
            System.out.println("Is Valid: " + results.isValid());
            System.out.println("Message: " + results.getMessage());
        }
    }
}
