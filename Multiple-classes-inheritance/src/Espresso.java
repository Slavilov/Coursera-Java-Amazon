public class Espresso extends Coffee{

    int numberOfShots;

    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    public void printEspressoDetails(){
        double totalBill = numberOfShots * price;
        System.out.println("You asked for " + numberOfShots + " servings! Every serving of Espresso costs "
                + price + "$. Your total bill is " + totalBill + "$.");
    }
}

