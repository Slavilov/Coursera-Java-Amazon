public class StringManipulation
{
    public static void main(String args[])
    {
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        String username = firstName.toLowerCase() + lastName.toLowerCase();
        email = email.replace("example", "gmail");
        int indexOf = email.indexOf('@');

        System.out.println("'username' after conversion and concatenation: " + username);
        System.out.println("'email' after replacing example.com with gmail.com: " + email);
        System.out.println("index of @ in the email address is: " + indexOf);

    }
}