package projects.loops;

import java.util.Scanner;

public class Exponentiation {

    public static void fourAndFiveExponent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        System.out.println("multiples of 4: ");
        for (int i = 4; i <= number; i*=4) {
            System.out.println(i);
        }

        System.out.println("multiples of 5: ");
        for (int i = 5; i <= number; i*=5) {
            System.out.println(i);
        }

    }

}
