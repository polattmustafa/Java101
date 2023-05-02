package projects;

import java.util.Scanner;

public class Taxi {

    public static void calculateTaximeter() {
        int statingPay = 10;
        double feeEveryKm = 2.2;
        int minAmount = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("how many kilometers have you traveled with taxi");
        double wayForward = sc.nextInt();

        double price = statingPay + wayForward * feeEveryKm;
        if (price < 20) {
            System.out.println(String.format("Your price is: %s", minAmount));
        } else {
            System.out.println(String.format("Your price is: %s", price));
        }

    }

}
