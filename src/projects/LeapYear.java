package projects;

import java.util.Scanner;

public class LeapYear {

    public static void calculateLeapYear() {
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıldır değildir !");

        }
    }
}
