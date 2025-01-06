import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cars myFirstCar = new Cars();

        myFirstCar.make = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.color = "Black";
        myFirstCar.year = 2019;

        myFirstCar.getCarDetails();

        Cars[] cars = new Cars[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            cars[i] = new Cars();

            System.out.print("Make: ");
            cars[i].make = scanner.nextLine();

            System.out.print("Model: ");
            cars[i].model = scanner.nextLine();

            System.out.print("Color: ");
            cars[i].color = scanner.nextLine();

            System.out.print("Year: ");
            cars[i].year = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
