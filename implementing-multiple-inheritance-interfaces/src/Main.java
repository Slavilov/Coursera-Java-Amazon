import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SideKick sideKickObject = new SideKick();
        WatADriver driverBot = new WatADriver();
        Scanner keyboardInput = new Scanner(System.in);
        int menuChoice;
        boolean keepMenuRunning;

        do {

            System.out.println("******* MENU FOR ROBOT CHOICE  *****");
            System.out.println("1. SideKick robot ");
            System.out.println("2. WatADriver robot ");
            System.out.println("**************************************");

            System.out.println("Enter your choice of robot(1 or 2): ");
            menuChoice = keyboardInput.nextInt();



            switch (menuChoice) {
                case 1:
                    /** TODO 1: Use the "sideKickObject", object of Sidekick class
                     *          to display the menu and then take the appropriate
                     *           action as required.
                     **/
                    sideKickObject.setChoice();
                    sideKickObject.takeAction();
                    if(sideKickObject instanceof KungFuSkills) {
                        sideKickObject.kungFuProtection();
                    } else {
                        System.out.print("Sorry no KungFu skills available.");
                    }


                    break;

                case 2:
                    /** TODO 2: Use the "driverBot" object of WatADriver class
                     *          to display the menu and then take the appropriate
                     *           action as required.
                     **/
                    driverBot.setChoice();
                    driverBot.takeAction();

                    break;

                default:
                    System.out.println("Invalid choice for a robot.");

            }

            // in case the input skips
            keyboardInput.nextLine();

            System.out.println("Another run? (enter y for yes/ any value for no):  ");
            String userInput = keyboardInput.nextLine();

            if(userInput.equalsIgnoreCase("y")) {
                keepMenuRunning = true;
            } else {
                keepMenuRunning = false;
            }

        } while (keepMenuRunning);
    }

    /** TODO 3: Create an interface named "KungFuSkills" **/

    /** TODO 4: In the interface "KungFuSkills" created in TODO 5,
     *          get inside the curly braces of the interface  in order
     *          to declare a method named "kungFuProtection()".
     *          Ensure that the  return type of the method is "void".
     **/

}
