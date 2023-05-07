package projects;

import java.util.Scanner;

public class AirTemperatureActivity {

    public static void suggestActivity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("You can do skiing");
        } else if (temperature >= 5 && temperature <= 15) {
            System.out.println("You can go to the cinema");
        } else if (temperature >= 15 && temperature <= 25) {
            System.out.println("You can go to the picnic");
        } else {
            System.out.println("You can go to the swimming");
        }

    }

}
