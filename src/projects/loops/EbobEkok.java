package projects.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EbobEkok {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter your second Number: ");
        int secondNumber = scanner.nextInt();

        List<Integer> firstNumberList = new ArrayList<>();
        for (int i = 1; i <= firstNumber; i++) {
            if (firstNumber % i == 0) {
                firstNumberList.add(i);
            }
        }

        List<Integer> secondNumberList = new ArrayList<>();
        for (int i = 1; i <= secondNumber; i++) {
            if (secondNumber % i == 0) {
                secondNumberList.add(i);
            }
        }

        Integer ebob = firstNumberList.stream()
                .filter(secondNumberList::contains)
                .max(Integer::compareTo)
                .orElse(null);

        Integer ekok = firstNumberList.stream()
                .filter(secondNumberList::contains)
                .min(Integer::compareTo)
                .orElse(null);

        System.out.println("Ebob = " + ebob);
        System.out.print("Ekok = " + ekok);


    }

}
