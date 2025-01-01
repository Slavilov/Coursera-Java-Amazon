public class Main {
    public static void main(String[] args) {
        // Variables to store the weight and height values
        double weight;
        double height;
        // Variable to hold the BMI value
        double bmi = 0;
        // Variable to hold the BMI system value obtained from user input
        String bmiSystem;
        // Variable to hold the BMI category determined by this BMI Calculator
        String bmiCategory;

        // Please initialize this reference variable to create an object of the UserInput class
        UserInput userInput = new UserInput();
        // Please initialize this reference variable to create an object of the BMICalculator class
        BMICalculator bmiCalculator = new BMICalculator();

        // Invoke the obtainBMISystem() of the UserInput class
        bmiSystem = userInput.obtainBMISystem();

        // A Switch statement that determines how user input for weight and height should be obtained based on the BMI system
        switch (bmiSystem.toUpperCase()) {
            // The case of IMPERIAL BMI system
            case "IMPERIAL":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiImperial(weight, height);
                break;
            // The case of METRIC BMI system
            case "METRIC":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiMetric(weight, height);
                break;
            // The case of empty BMI system due to invalid user input
            case "":
                System.out.println("Please Enter a valid BMI System as input");
                break;
        }

        System.out.println("Your BMI is: " + bmi);

        bmiCategory = bmiCalculator.getBMICategory(bmi);

        System.out.println("Your BMI category is: " + bmiCategory);
    }
}
