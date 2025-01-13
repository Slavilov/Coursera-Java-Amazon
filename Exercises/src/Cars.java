public class Cars
{
    String make;
    String model;
    String color;
    int year;

    public Cars() {
        this.make = "Unknown"; // Set a placeholder make
        this.model = "Unknown"; // Set a placeholder model
        this.color = "Black"; // Set a default color
        this.year = 2004;
    }

    public Cars(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getCarDetails()
    {
        return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;
    }

    // Method (action) to accelerate the Car
    public void accelerate() {
        System.out.println("The car is accelerating!");
    }

    // Method (action) to turn the Car
    public void turn() {
        System.out.println("The car is turning!");
    }
}
