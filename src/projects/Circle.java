package projects;

import java.util.Scanner;

public class Circle {

    public static void findCircleChores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find area and circumference press 1, to find circle slice area press 2");
        int choose = sc.nextInt();

        if (choose == 1) {
            System.out.println("Enter radius of circle: ");
            int radius = sc.nextInt();
            double circleArea = findCircleArea(radius);
            System.out.println(String.format("Area of circle is: %s", circleArea));
            double circumferenceOfCircle = findCircumferenceOfCircle(radius);
            System.out.println(String.format("Circumference of Circle is: %s", circumferenceOfCircle));
        } else if (choose == 2) {
            System.out.println("Enter radius of circle: ");
            int radius = sc.nextInt();
            System.out.println("Enter center angle of circle: ");
            int centerAngle = sc.nextInt();
            double circleZoneField = findCircleZoneField(radius, centerAngle);
            System.out.println(String.format("Area of circle zone field: %s", circleZoneField));
        } else {
            System.out.println("Wrong choice!");
        }

    }

    public static double findCircleArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double findCircumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double findCircleZoneField(int radius, int centerAngle) {
        return (Math.PI * (radius * radius) * centerAngle) / 360;
    }


}
