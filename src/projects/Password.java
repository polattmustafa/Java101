package projects;

import java.util.Scanner;


public class Password {

    public static void encrypt() {
        String username = "mustafa";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Username of password is wrong.");

            System.out.print("Do you want to password (Y/N) ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();

                if (newPassword.equals(inputPassword)) {
                    System.out.println("Your new password cannot be the same as your old password. Please enter another password.");
                } else {
                    password = newPassword;
                    System.out.println("New password created.");
                }
            }
        }

    }
}
