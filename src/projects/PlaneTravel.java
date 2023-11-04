package projects;

import java.util.Scanner;

public class PlaneTravel {

    public static void calculateBalance() {
        int distance, age, travelType;
        double totalPrice, ageDiscountPrice, typeDiscountPrice;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        distance = scanner.nextInt();
        totalPrice = distance * 0.10;

        System.out.print("Yaşınızı giriniz :");
        age = scanner.nextInt();
        if (age < 12) {
            ageDiscountPrice = totalPrice / 2;
            totalPrice -= ageDiscountPrice;
        }
        else if (age <= 24) {
            ageDiscountPrice = totalPrice * 0.1;
            totalPrice -= ageDiscountPrice;
        }
        else if (age > 65) {
            ageDiscountPrice = totalPrice * 0.3;
            totalPrice -= ageDiscountPrice;
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        travelType = scanner.nextInt();
        if (travelType == 2) {
            typeDiscountPrice = totalPrice * 0.2;
            totalPrice -= typeDiscountPrice;
            totalPrice *= 2;
        } else if (travelType != 1) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }
        System.out.print("Toplam Tutar = " + totalPrice + " TL");

    }

}
