package projects;

import java.util.Scanner;

public class Triangle {
    // Can 3 sides form a triangle method can be added

    public static void makeTriangleOperations() {
        Scanner sc = new Scanner(System.in);
        int firstEdge = 0, secondEdge = 0, thirdEdge = 0;
        System.out.println("To find Hypotenuse press 1, to find area and perimeter press 2");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.println("Enter first edge of triangle");
            firstEdge = sc.nextInt();
            System.out.println("Enter second edge of triangle");
            secondEdge = sc.nextInt();
            double hypo = findHypotenuse(firstEdge, secondEdge);
            String.format("hypo is %s", hypo);
        } else if (choose == 2) {
            System.out.println("Enter first edge of triangle");
            firstEdge = sc.nextInt();
            System.out.println("Enter second edge of triangle");
            secondEdge = sc.nextInt();
            System.out.println("Enter second edge of triangle");
            thirdEdge = sc.nextInt();
            double perimeterOfTriangle = findPerimeter(firstEdge, secondEdge, thirdEdge);
            System.out.println(String.format("perimeter of triangle is %s ", perimeterOfTriangle));
            double triangleArea = findArea(firstEdge, secondEdge, thirdEdge);
            System.out.println(String.format("Area of triangle is %s ", triangleArea));
        } else {
            System.out.println("Wrong choice");
        }



    }

    public static double findHypotenuse(int firstEdge, int secondEdge) {
        if (firstEdge < 0 || secondEdge < 0) {
            System.out.println("Edges can not be under 0");
            return 0.0;
        }
        double frameSumOfSides = (firstEdge * firstEdge) + (secondEdge * secondEdge);
        return Math.sqrt(frameSumOfSides);
    }

    public static double findPerimeter(int firstEdge, int secondEdge, int thirdEdge) {
        return (double) firstEdge + secondEdge + thirdEdge;
    }

    public static double findArea(int firstEdge, int secondEdge, int thirdEdge) {
        double u = (double) (firstEdge + secondEdge + thirdEdge) / 2;
        return (u * (u - firstEdge) * (u - secondEdge) * (u - thirdEdge)) / 2;
    }

}
