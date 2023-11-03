package projects;

import java.util.Scanner;

public class Horoscope {

    public static void guessHoroscope() {
        String birthMonth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth month = ");
        birthMonth = scanner.nextLine();

        if (birthMonth.equalsIgnoreCase("JANUARY")) {
            System.out.println("Your horoscope should be Capricorn or Aquarius");
        }
        else if (birthMonth.equalsIgnoreCase("FEBRUARY")) {
            System.out.println("Your horoscope should be Aquarius or Pisces");
        }
        else if (birthMonth.equalsIgnoreCase("MARCH")) {
            System.out.println("Your horoscope should be Pisces or Aries");
        }
        else if (birthMonth.equalsIgnoreCase("APRIL")) {
            System.out.println("Your horoscope should be Aries or Taurus");
        }
        else if (birthMonth.equalsIgnoreCase("MAY")) {
            System.out.println("Your horoscope should be Taurus or Gemini");
        }
        else if (birthMonth.equalsIgnoreCase("JUNE")) {
            System.out.println("Your horoscope should be Gemini or Cancer");
        }
        else if (birthMonth.equalsIgnoreCase("JULY")) {
            System.out.println("Your horoscope should be Cancer or Leo");
        }
        else if (birthMonth.equalsIgnoreCase("AUGUST")) {
            System.out.println("Your horoscope should be Leo or Virgo");
        }
        else if (birthMonth.equalsIgnoreCase("SEPTEMBER")) {
            System.out.println("Your horoscope should be Virgo or Libra");
        }
        else if (birthMonth.equalsIgnoreCase("OCTOBER")) {
            System.out.println("Your horoscope should be Libra or Scorpio");
        }
        else if (birthMonth.equalsIgnoreCase("NOVEMBER")) {
            System.out.println("Your horoscope should be Scorpio or Sagittarius");
        }
        else if (birthMonth.equalsIgnoreCase("DECEMBER")) {
            System.out.println("Your horoscope should be Sagittarius or Capricorn");
        }
        else {
            System.out.println("Your birth date ise wrong");
        }

    }

}
