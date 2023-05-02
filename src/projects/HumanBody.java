package projects;

import java.util.Scanner;

public class HumanBody {

    public static void calculateBodyMassIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height(m)");
        double height = sc.nextDouble();
        System.out.println("Enter your weight");
        int weight = sc.nextInt();
        double index = calculateIndex(height, weight);
        System.out.println(String.format("your index is: %s", index));
    }

    public static double calculateIndex(double height, int weight) {
        return weight / (height * height);
    }
}
