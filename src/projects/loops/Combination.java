package projects.loops;

import java.util.Scanner;

public class Combination {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which combination of numbers do you want to calculate?");
        int number = scanner.nextInt();

        System.out.println("How many combinations do you want to calculate?");
        int numberComb = scanner.nextInt();

        int numberFac = 1, numberCombFac = 1, numberDiffFac = 1;
        for (int i = 1; i <= number; i++) {
            numberFac *= i;
        }

        for (int i = 1; i <= numberComb; i++) {
            numberCombFac *= i;
        }

        int numberDiff = number - numberComb;
        for (int i = 1; i <= numberDiff; i++) {
            numberDiffFac *= i;
        }
        int combinationResult = (numberFac / (numberCombFac * (numberDiffFac)));
        System.out.println(combinationResult);
    }

}
