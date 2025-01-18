import java.util.Scanner;

public class car {
    public static void main(String[] args) {

        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        boolean carStarted = false;
        String gear = "P";
        int speed = 0;
        int choice = 0;
        Scanner keyBoard   = new Scanner(System.in);


        while (choice != 5)
        {
            // TODO 2: Display the current state of the car (engine state, gear, speed)
            System.out.println("------ Car Dashboard ------");
            System.out.println("Speed: " + speed);
            System.out.println("Gear: " + gear);


            // TODO 3: Add print statements for each variable you want to display or options available to the user
            System.out.println("Menu:");
            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Choose Acceleration speed");
            System.out.println("4. Choose Brake speed");
            System.out.println("5. Choose to Exit");

            // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
            System.out.print("Enter your choice: ");
            choice = keyBoard.nextInt();


            // TODO 5: Implement a switch statement to handle the different menu choices
            switch (choice) {
                case 1:
                    System.out.println("Please choose either on or off!");
                    String either = keyBoard.next();
                    if (either == "on") {
                        carStarted = true;
                    } else {
                        carStarted = false;
                    }
                    break;
                case 2:
                    System.out.println("Please choose a gear, either P, D or R");
                    String eitherTwo = keyBoard.next();
                    if (eitherTwo == "P") {
                        gear = "P";
                    } else if (eitherTwo == "D") {
                        gear = "D";
                    } else {
                        gear = "R";
                    }
                    break;
                case 3:
                    System.out.println("Choose Acceleration speed");
                    speed = keyBoard.nextInt();
                    break;
                case 4:
                    System.out.println("Choose speed with which you want to slow down it must be lower then the Acceleration speed");
                    int decelerationSpeed = keyBoard.nextInt();
                    speed = speed - decelerationSpeed;
                    break;
                case 5:
                    System.out.println("You choose to EXIT!");
                    break;
            }

        }


        // TODO 6: Make sure the program runs until the user decides it's time to stop. Consider enclosing TODO 2 -> TODO 5 above in a while loop!


    }
}
