import java.util.Scanner;

public class DrivingSimulationLab {

    // Initial car state variables
    public static String gear = "P"; // Gear starts in Park
    public static int speed = 0;      // Initial speed is 0
    public static boolean isEngineOn = false; // Engine is initially off

    // Scanner for user input
    public static Scanner keyboard = new Scanner(System.in);

    // Start the car simulation
    public static void startSimulation() {
        boolean displayMenu = true;
        while (displayMenu) {
            displayDashboard(); // Show the current state of the car
            int choice = getUserChoice(); // Get user input
            processChoice(choice); // Process the user's choice
            System.out.println();
        }
    }

    // Display the car dashboard and menu options
    public static void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        System.out.println("Gear: " + gear);
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    // Get the user's choice from the menu
    public static int getUserChoice() {
        System.out.print("Enter your choice: ");
        while (!keyboard.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            keyboard.next();
        }
        return keyboard.nextInt();
    }

    // Process the user's choice
    public static void processChoice(int choice) {
        switch (choice) {
            case 1 -> toggleEngine();
            case 2 -> changeGear();
            case 3 -> accelerate();
            case 4 -> brake();
            case 5 -> exitSimulation();
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    // Toggle the engine on or off
    public static void toggleEngine() {
        System.out.print("Do you want to turn the engine On or Off? (On/Off): ");
        String onOrOff = keyboard.next();
        if (onOrOff.equalsIgnoreCase("On")) {
            isEngineOn = true;
            System.out.println("Engine is now On.");
        } else if (onOrOff.equalsIgnoreCase("Off")) {
            isEngineOn = false;
            speed = 0; // Reset speed when engine is off
            gear = "P"; // Reset gear to Park when engine is off
            System.out.println("Engine is now Off.");
        } else {
            System.out.println("Invalid input. Engine state unchanged.");
        }
    }

    // Change the car's gear
    public static void changeGear() {
        if (!isEngineOn) {
            System.out.println("Cannot change gear. The engine is off.");
            return;
        }

        System.out.print("Enter desired gear (P, D, R): ");
        String gearChoice = keyboard.next().toUpperCase();

        if (gearChoice.equals("P") || gearChoice.equals("D") || gearChoice.equals("R")) {
            gear = gearChoice;
            System.out.println("Gear changed to: " + gear);
        } else {
            System.out.println("Invalid gear choice.");
        }
    }

    // Accelerate the car
    public static void accelerate() {
        if (isEngineOn && !gear.equals("P")) {
            speed += 10;
            System.out.println("Accelerated. Current speed: " + speed);
        } else {
            System.out.println("Cannot accelerate. Ensure the engine is on and the gear is not in Park.");
        }
    }

    // Apply the brakes
    public static void brake() {
        if (isEngineOn && speed > 0) {
            speed = Math.max(speed - 5, 0); // Reduce speed by 5 but not below 0
            System.out.println("Brakes applied. Current speed: " + speed);
        } else {
            System.out.println("Cannot brake. Either the engine is off or the speed is already 0.");
        }
    }

    // Exit the simulation
    public static void exitSimulation() {
        System.out.println("Exiting the driving simulation. Goodbye!");
        System.exit(0);
    }

    // Main method to start the program
    public static void main(String[] args) {
        startSimulation();
    }
}
