public class Main {
    public static void main(String[] args){
        
        Camera myFavoriteCamera = new Camera();

        // Take picture with default settings
        myFavoriteCamera.takePicture();

        // Take picture with a specific mode
        myFavoriteCamera.takePicture("portrait");

        // Take picture with a specific resolution
        myFavoriteCamera.takePicture(12);

        // Take picture with a specific mode and resolution
        myFavoriteCamera.takePicture("landscape", 24);

        SmartCamera smartCam = new SmartCamera();

        // Take picture using the smart camera with default settings
        System.out.println("\nInitiating smart camera...");
        smartCam.takePicture();
    }
}
