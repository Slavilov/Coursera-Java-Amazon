public class StringExerciseTwo
{
    public static void main(String[] args)
    {
        String text = "Java programming is fun and educational.";
        System.out.println("Does the text contains the word 'fun' :" + text.contains("fun"));

        String replacedText = text.replace("educational", "awesome");
        System.out.println("The new text with the replaced word :" +replacedText);

        System.out.println("The length of the original sentance :" + text.length());

        String shortenedText = text.substring(0, 17);
        System.out.println("The shortened text :" +shortenedText);
    }
}
