public class StringExercise
{

        public static void main(String[] args) {
            String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
            //TODO: Complete the code statement to find out the length of bookTitle
            int titleLength = bookTitle.length();
            System.out.println("Length of the book title: " + titleLength);

            //Declare and initialise the length of shortened book title
            int maxLength = 20;

            if (titleLength > maxLength)
            {
                // Shortened the book title
                String shortBookTitle = bookTitle.substring(0,19); // TODO: Write the code to shorten the bookTitle to 20 characters

                System.out.println("Original title: " + bookTitle);
                System.out.println("Shortened title: " + shortBookTitle);
            }

            // Declare and initialize the searchWord
            String searchWord = "Captain";

            // Check if the searchWord is present in book title
            boolean containsWord = bookTitle.contains(searchWord);//TODO: Write the code snippet to check if searchWord is present in bookTitle.
            System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);
        }
    }
