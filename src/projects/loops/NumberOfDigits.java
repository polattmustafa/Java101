package projects.loops;

import java.util.Scanner;

public class NumberOfDigits {

    public static void calculateSumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = scanner.nextInt();

        int digitNumber = 0, total = 0;
        while (a > 0) {
            total += a % 10;
            a /= 10;
            digitNumber++;
        }

        System.out.println(total);

    }

}
