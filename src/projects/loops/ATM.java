package projects.loops;

import java.util.Scanner;

public class ATM {

    public static void manage() {
        String username, password;
        Scanner input = new Scanner(System.in);
        int attempts = 3;
        int accountBalance = 1500;
        int userChoice;

        while (attempts > 0) {
            System.out.print("Username: ");
            username = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, welcome to Kodluyoruz Bank!");
                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.print("Please choose the transaction you want to perform: ");
                    userChoice = input.nextInt();

                    switch (userChoice) {
                        case 1:
                            System.out.print("Amount to deposit: ");
                            int depositAmount = input.nextInt();
                            accountBalance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Amount to withdraw: ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > accountBalance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                accountBalance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + accountBalance);
                            break;
                        case 4:
                            System.out.println("Goodbye.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                } while (userChoice != 4);

                break;
            } else {
                attempts--;
                System.out.println("Incorrect username or password. Please try again.");
                if (attempts == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Attempts remaining: " + attempts);
                }
            }
        }
    }
}
