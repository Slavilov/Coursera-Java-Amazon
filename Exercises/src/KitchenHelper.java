public class KitchenHelper {
    // Your method signature
    public static double calculateIngredientQuantity(int servings, double originalQuantity)
    {
        // Your code here!
        // Calculate the adjusted ingredient quantity
        double ingredienQuantity = servings*originalQuantity;

        // replace 0.0 with the adjusted quantity
        return ingredienQuantity;
    }

    // Your method signature
    public static void spiceUpDish(int spiceLevel)
    {
        // Your code here!
        // Print a message suggesting spices based on the spiceLevel
        System.out.println("The spice levels are: " +spiceLevel);
    }

    // Your method signature
    public static void greetGuest(String name, String timeOfDay)
    {
        // Your code here!
        // Print a personalized greeting based on arguments
        // For example, Hi Bob, Good Afternoon!
        System.out.println("Hello " + name + ", Good " + timeOfDay + "!");
    }

    public static void main(String[] args) {
        // calling the methods with different arguments

        // Replace these arguments with your own values
        double newQuantity = calculateIngredientQuantity(0, 0.0);
        spiceUpDish(0);
        greetGuest("guest", "time");
    }
}