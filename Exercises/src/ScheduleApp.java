/** TODO 1: Import the Scanner **/
import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class ScheduleApp {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        /** TODO 2: Create a Scanner variable named "keyboard" **/
        Scanner keyboard = new Scanner(System.in);
        int subChoice;

        /** TODO 3: A variable for getting the day of the week is given below **/
        /**         Initialize the variable to have the value 1 **/
        /** 1- is Monday, 2- is Tuesday and so on **/
        int dayOfTheWeek = 1;

        /** TODO 4: Display a menu to get the day of the week from the user **/

        System.out.println("         ********** MENU *****************\n" +
                "         These are the choices for week of the day. \\n Please enter only values from 1-7:\n" +
                "         1. MONDAY\n" +
                "         2. TUESDAY\n" +
                "         3. WEDNESDAY\n" +
                "         4. THURSDAY\n" +
                "         5. FRIDAY\n" +
                "         6. SATURDAY\n" +
                "         7. SUNDAY\n" +
                "         ***********************************");



        /** TODO 5: Prompt Toni for input. Also let Toni know the valid choices like (1-7). **/
        System.out.println("Please choose a day of the week from 1 to 7!");
        dayOfTheWeek = keyboard.nextInt();

        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
        /**         for the input in "dayOfTheWeek" **/
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");

                System.out.println("********** SUB MENU FOR MONDAY ******\n" +
                        "         * 1. Yes, I had my breakfast\n" +
                        "         2. No, I would like one\n" +
                        "         **************************************\n" +
                        "\n" +
                        "         **/");
                subChoice = keyboard.nextInt();

                if (subChoice == 1)
                {
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes!");
                }
                else if (subChoice == 2)
                {
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in!");
                }
                else
                {
                    System.out.println("No such choice available!");
                }

                break;
            case 2:
                System.out.println("Tuesday: It is back to work.....");

                System.out.println("Please choose which Language you are going to use:");
                System.out.println("1 for C++");
                System.out.println("2 for Java");
                subChoice = keyboard.nextInt();
                if (subChoice == 1)
                {
                    System.out.println("Ouch! C++ hard one!");
                }
                else
                {
                    System.out.println("Nice one! Java is great!");
                }


                break;
            case 3:
                System.out.println("Wednesday: It is back to work.....");

                System.out.println("Please choose your type of design by typing the corresponding number:");
                System.out.println("1 - Simple Design");
                System.out.println("2 - Complex Design");
                subChoice = keyboard.nextInt();

                if (subChoice == 1)
                {
                    System.out.println("Well its going to be a Simple Design then!");
                }
                else
                {
                    System.out.println("Ohhhh Complex Design, its going to be hard!");
                }

                break;
            case 4:
                System.out.println("Thursday: It is back to work.....");

                System.out.println("Choose your IDE by typing the corresponding number:");
                System.out.println("1 - IntelliJ IDEA");
                System.out.println("2 - Eclipse");
                System.out.println("3 - NetBeans");
                System.out.println("4 - VS Code");
                System.out.println("5 - Other");

                subChoice = keyboard.nextInt();

                switch (subChoice) {
                    case 1:
                        System.out.println("You chose IntelliJ IDEA. A powerful IDE for Java and more!");
                        break;
                    case 2:
                        System.out.println("You chose Eclipse. Great for Java development with lots of plugins.");
                        break;
                    case 3:
                        System.out.println("You chose NetBeans. An IDE with excellent support for Java and other languages.");
                        break;
                    case 4:
                        System.out.println("You chose VS Code. Lightweight and versatile for many programming languages.");
                        break;
                    case 5:
                        System.out.println("You chose Other. There are many great IDEs to explore!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a number between 1 and 5.");
                }


                break;
            case 5:
                System.out.println("Friday: It is back to work.....");

                System.out.println("Where there any errors in the program, please answer with:");
                System.out.println("1 for Yes!");
                System.out.println("2 for No!");

                subChoice = keyboard.nextInt();
                if (subChoice == 1)
                {
                    System.out.println("I hope you have fixed the errors!");
                }
                else
                {
                    System.out.println("Great! You have done a great job!");
                }

                break;
            case 6:
                System.out.println("Saturday: It is back to work.....");
                break;
            case 7:
                System.out.println("Sunday: It is back to work.....");
                break;
            default:
                System.out.println("The number for the day of the week that you typed is invalid!");

                /** TODO 6(a): Implement all other cases for Tuesday to Sunday **/

                /** TODO 6(b): Implement "default" to handle Toni entering  **/
                /**            values less than 1 or more than 7 **/
        }

        /** TODO 7: Introduce a "break" after each case code, except the last  **/

        /** TODO 8: Go below the TODO 2 after the creation of Scanner variable  **/
        /**         and declare a variable "subChoice" **/

        /** TODO 9: Move below the display "Monday: It is back to work....." **/
        /**         in case 1 and create a menu  **/
        /** The sub-menu inside case 1 show appear as below:

         *********** SUB MENU FOR MONDAY ******
         * 1. Yes, I had my breakfast
         2. No, I would like one
         **************************************

         **/

        /** TODO 10: After the sub-menu inside case 1, prompt for input on choice **/
        /**         from Toni and store it in the variable subChoice **/

        /** TODO 11: Display appropriate response to Toni, based on value in **/
        /**          variable subChoice using if, if-else, else **/
        /**
         1. When subChoice has value of 1 display -
         Good. Now you have a catchup meeting at 9AM Prepare your notes

         2. When subChoice has value of 2 display -
         Lets us divert on Highway 54 and have a Burger on the drive in

         3. When subChoice has any other value then 1 or 2 display -
         NO such choice available
         **/


    } //end of main method

} //end of the main class