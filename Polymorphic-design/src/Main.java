public class Main {
    public static void main(String[] args){
        Book greatGatsbyBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Movie inceptionMovie = new Movie("Inception", "Christopher Nolan", 148);
        Music imagineMusic = new Music("Imagine", "John Lennon", "Rock");

        MediaLibrary library = new MediaLibrary();

        Media addedBook = library.addMedia(greatGatsbyBook);
        Media addedMovie = library.addMedia(inceptionMovie);
        Media addedMusic = library.addMedia(imagineMusic);

        library.playMedia(addedBook);
        library.playMedia(addedMovie);
        library.playMedia(addedMusic);
    }

}
