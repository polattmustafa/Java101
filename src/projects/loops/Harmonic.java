package projects.loops;

import java.util.Scanner;

public class Harmonic {

    public static void calculate() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number");
        int number = scanner.nextInt();

        double total = 0;
        for (int i = 1; i <= number; i++) {
            total += (double) 1 / i;
        }
        System.out.println(total);

    }
}
