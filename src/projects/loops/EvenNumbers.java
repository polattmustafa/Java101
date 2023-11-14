package projects.loops;

import java.util.Scanner;

public class EvenNumbers {

    public static void getEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void additionEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.print("Enter even numbers you want to addition. Enter odd number if you exit: ");
            int inputNumber = scanner.nextInt();
            if (inputNumber % 2 == 0) {
                number += inputNumber;
            } else {
                System.out.print("Addition of your numbers = " + number);
                return;
            }
        }
    }

}
