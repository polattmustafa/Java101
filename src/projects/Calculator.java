package projects;

import java.util.Scanner;

public class Calculator {

    public static void calculate() {

        Scanner sc = new Scanner(System.in);
        System.out.println("For addition enter 1 \nFor extraction enter 2 \nFor impact press 3 \nFor divide press 4");
        int choose = sc.nextInt();

        System.out.println("Enter first number:");
        double numberOne = sc.nextInt();
        System.out.println("Enter second number:");
        double numberTwo = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println(numberTwo + numberOne); break;

            case 2:
                System.out.println(numberOne - numberTwo); break;

            case 3:
                System.out.println(numberOne * numberTwo); break;

            case 4:
                System.out.println(Double.parseDouble(String.valueOf(numberOne / numberTwo))); break;
        }

    }
}
