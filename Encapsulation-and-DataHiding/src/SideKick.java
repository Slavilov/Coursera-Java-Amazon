import java.util.Scanner;
public class SideKick {
    /**
     * Object of Scanner class to input values from the user
     **/
    Scanner keyboard;

    /** TODO 1: Make property modeOfOperation protected from outside access **/
    /**
     * Property to check the mode - default is cleaning
     * +-------------+---------------+
     * | Mode Value  | Action        |
     * +-------------+---------------+
     * |     1       |  Cleaning     |
     * |     2       |  Cooking      |
     * |     3       |  Re-charge    |
     * |  Others     | Not Supported |
     * +-------------+---------------+
     **/
    private int modeOfOperation;


    /** charge of battery  **/
    int batteryCharge;

    /** Constructor **/
    public SideKick() {
        keyboard = new Scanner(System.in);

        // initial charge of battery is 0
        batteryCharge = 0 ;

        // set default to cleaning or 1
        modeOfOperation = 1;
    }


     /* code for battery recharge from previous VIDEO Item :
                                            "Introduction to Encapsulation and data hiding" */

    /* Getter method */
    public int getBatteryCharge() {
        return batteryCharge;
    }

    /* Setter method */
    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public void rechargeBattery() {
        System.out.println("Plug into socket.....");
        System.out.print("Charging ..");
        for (int i = 0; i <= 100; i += 10) {
            System.out.print(".");
            batteryCharge = i;

        }
        System.out.println("\nUnplug from socket.....");
        System.out.println("Fully charged.....");

    }

    public void displayBatteryLevel() {
        System.out.println("The battery charge is at :" + batteryCharge + " %.");
    }

    /* end of code for battery recharge from previous VIDEO Item :
                                            "Introduction to Encapsulation and data hiding" */

    // accessor/getter method  for modeOfOperation
    /** TODO 5: Implement a getter for "modeOfOperation" using Java convention   **/
    public int getModeOfOperation() {

        return modeOfOperation;
    }

    // mutator/setter method for modeOfOperation
    /** TODO 7: Implement a setter for "modeOfOperation" using Java convention   **/

    /** TODO 8: In the setter method you created in TODO 7 put in a condition
     *          to ensure that if the value being passed is not between 1 and 3
     *          then set it to the default of 1 - which represents cleaning
     **/
    public void setModeOfOperation(int mode) {
        if (mode < 1 || mode > 3) {
            mode = 1; // Set to 1 if out of range
        }
        this.modeOfOperation = mode;
    }

    // method to set choice
    public void setChoice() {
        System.out.println("***** SideKick Menu *****");
        System.out.println("1. Cleaning");
        System.out.println("2. Cooking");
        System.out.println("3. Re-charge");

        System.out.println("Enter choice(1-3):");
        int choice = keyboard.nextInt();
        modeOfOperation = choice;
    }

    // method to take action
    public void takeAction() {
        switch (modeOfOperation) {
            case 1:
                cleanHouse();
                System.out.println("SideKick cleaning completed.");
                break;
            case 2:
                /** TODO 14: call the method cookFood() you created in TODO 13  **/
                System.out.println("SideKick cooking completed.");
                break;
            case 3:
                rechargeBattery();
                System.out.println("SideKick recharged battery.");
                break;
            default:
                System.out.println("SideKick does not support the operation.");
        }
    }


    /** TODO 11: The method cleanHouse() will only be used internally.
     *           Protect it with "private"
     **/
    // method to clean
    private void cleanHouse() {
        System.out.println("Get the vacuum cleaner.....");
        System.out.println("Put the dust bag in vacuum.....");
        System.out.println("Go to Living room and clean.....");
        System.out.println("Go to bedroom and clean.....");
        System.out.println("Go to kitchen and clean.....");
        System.out.println("Go to bathroom and clean.....");
        System.out.println("Retrieve dust bag from vacuum cleaner and put in bin.....");
        System.out.println("Go back to Toni.....");
    }

    // method to cook
    /** TODO 13: Create a method to display the tasks SideKick does
     *           in order to cook, like
     *           1. Move to the kitchen
     *           2. Get the vegetables
     *           3. Cut the vegetables
     *           4. Turn on the gas
     *           5. Get the cooking pan and oil ready
     *           6. Cook the food
     *           7. Turn off the gas
     *           8. Get it ready on the plate
     *           9. Go back to Toni
     *
     **/

    private void displayCookingTasks() {
        String[] cookingTasks = {
                "1. Move to the kitchen",
                "2. Get the vegetables",
                "3. Cut the vegetables",
                "4. Turn on the gas",
                "5. Get the cooking pan and oil ready",
                "6. Cook the food",
                "7. Turn off the gas",
                "8. Get it ready on the plate",
                "9. Go back to Toni"
        };

        System.out.println("SideKick's Cooking Tasks:");
        for (String task : cookingTasks) {
            System.out.println(task);
        }
    }

}
