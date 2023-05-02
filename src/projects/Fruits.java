package projects;

import java.util.Scanner;

public class Fruits {

    public static void calculateFruitAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much does pear weigh? :");
        int pearWeight = sc.nextInt();
        System.out.print("How much does apple weigh? :");
        int appleWeight = sc.nextInt();
        System.out.print("How much does tomato weigh? :");
        int tomatoWeight = sc.nextInt();
        System.out.print("How much does banana weigh? :");
        int bananaWeight = sc.nextInt();
        System.out.print("How much does eggplant weigh? :");
        int eggplantWeight = sc.nextInt();

        double totalPrice = (pearWeight * 2.14) +
                (appleWeight * 3.67) +
                (tomatoWeight * 1.11) +
                (bananaWeight * 0.95) +
                (eggplantWeight * 5.00);
        System.out.println(String.format("Total price is : %s TL", totalPrice));

    }

}
