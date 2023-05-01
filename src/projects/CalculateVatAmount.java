package projects;

import java.util.Scanner;

public class CalculateVatAmount {

    public static void calculateVAT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money:");
        int money = sc.nextInt();
        double VAT = calculate(money);
        String VatValueStr = String.format("Your VAT is %s", VAT);
        System.out.println(VatValueStr);
    }
    public static double calculate(int money) {
        if (money < 0) {
            System.out.println("Money could not be negative");
            return money;
        }
        else if (money > 0 && money < 1000)
            return (double) (money * 18) / 100;
        else
            return (double) (money * 8) / 100;
    }

}
