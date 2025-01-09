public class FinalExam
{
    public static void main(String[] args)
    {
        String firstName = "Sandy";
        String lastName = "Jones";

        String movieTitle = "The Source Code";
        int numberOfTickets = 8;

        double pricePerTicket = 10.57;
        double totalPrice = numberOfTickets*pricePerTicket;

        String username = firstName+lastName;
        String userName = username.toLowerCase();

        String movieName = movieTitle.toUpperCase();


        System.out.println("Congratulations!! You have successfully booked the tickets\n");

        System.out.println("Username: " + userName);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Price per ticket: $" + String.format("%.2f", pricePerTicket));
        System.out.println("Total price of 8 tickets: $" + String.format("%.2f", totalPrice));

        System.out.println("\nThank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!\n");

    }
}