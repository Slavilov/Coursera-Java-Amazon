public class StringMethods
{
        public static void main(String args[]) {
            String text = "Adventure";

            // TODO: Check the length using length() and print the length
            int lengthOfText = text.length();
            System.out.println("The length of the text is: " + lengthOfText);

            // TODO: Get the character at position 3 and print the character
            char charOfPositionThree = text.charAt(2);
            System.out.println("The character of Position three is: " +charOfPositionThree);

            // TODO: Get a part of the String from position 1 to 4 and print the string
            String partialString = text.substring(1, 4);
            System.out.println("The partial string is: " +partialString);


            String anotherText= "Adventure";

            // TODO: Compare text with anotherText using equals() and print the output
            boolean isTrue = text.equals(anotherText);
            System.out.println("Are the two strings equal, True or False: " + isTrue);

            // TODO: Change to uppercase using toUpperCase() and print the converted string
            String upperCaseText = anotherText.toUpperCase();
            System.out.println("The changed string to Upper Case is: " + upperCaseText);

            // TODO: Change to lowercase using toLowerCase() and print the converted string
            String lowerCaseText = anotherText.toLowerCase();
            System.out.println("The changed string to Lower Case is: " + lowerCaseText);

            // TODO: Check if it contains "vent" using contains() and print the output
            boolean checkIfContains = anotherText.contains("vent");
            System.out.println("Check if the text contains the wording vent: " + checkIfContains);

            // TODO: Replace 'e' with 'a' and print the output
            anotherText.replace('e', 'a');
            System.out.println("The string after the chars being replaced is: " + anotherText);
        }
    }
