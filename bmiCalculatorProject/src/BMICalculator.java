public class BMICalculator {

    double weightInPounds;
    double weightInKilograms;
    double heightInInches;
    double heightInMeters;


    public BMICalculator() {
        this.weightInPounds = 0;
        this.weightInKilograms = 0;
        this.heightInInches = 0;
        this.heightInMeters = 0;

    }

    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        double bmi = (703*weightInPounds)/(heightInInches*heightInInches);
        return bmi;
    }

    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        double bmi = weightInKilos/(heightInMeters*heightInMeters);
        return bmi;
    }

    public String getBMICategory(double bmi) {
        if(bmi<18.5)
        {
            return "Underweight";
        }
        else if (bmi < 25)
        {
            return "Normal weight";
        }
        else if (bmi < 30 )
        {
            return "Overweight";
        }
        else {
            return "Obese";
        }

    }
}
