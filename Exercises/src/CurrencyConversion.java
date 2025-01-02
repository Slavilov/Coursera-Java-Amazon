public class CurrencyConversion
{
    public static void main(String args[])
    {
        double amountInUSD = 100.0;
        double exchangeRateUSDToEUR = 0.85;
        System.out.println("Total available amount of USD: " + amountInUSD);

        amountInUSD = amountInUSD*exchangeRateUSDToEUR;
        System.out.println("Total available amount of EUR after calculation: " + amountInUSD);

        amountInUSD = amountInUSD - 55;
        System.out.println("Total available amount of EUR after deduction: " + amountInUSD);

        //amountInUSD = amountInUSD + (amountInUSD * 0.15);
        amountInUSD /= exchangeRateUSDToEUR;
        System.out.println("Total available amount of USD after calculation: " + amountInUSD);

    }
}