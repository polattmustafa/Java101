package projects.loops;

import java.util.Scanner;

public class ExponentNumbers {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Enter your number");
        a = scanner.nextInt();

        System.out.print("Enter your exponent");
        b = scanner.nextInt();

        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);

    }

}
