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

}
