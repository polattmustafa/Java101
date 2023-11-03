package projects;

import java.util.Arrays;
import java.util.Scanner;

public class FromBigToSmall {

    public static void sort() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three number:");
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);

        System.out.println("From big to small numbers:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();

    }

}
