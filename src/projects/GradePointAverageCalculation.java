package projects;

import java.util.Scanner;

public class GradePointAverageCalculation {

    public static void calculate() {
        int grade, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grades Enter your grades in order by the following lessons:" +
                " 1)math, 2)physic, 3)chemistry, 4)turkish, 5)history, 6)music");

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ") ");
            grade = sc.nextInt();
            total += grade;
        }
        double avarage = (double) total / 6;
        System.out.println(avarage);

    }

}
