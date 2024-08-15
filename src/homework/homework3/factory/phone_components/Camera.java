package homework.homework3.factory.phone_components;

public class Camera {
    private int numberOfMegapixels;

    public Camera(int numberOfMegapixels) {
        this.numberOfMegapixels = numberOfMegapixels;
    }

    public void takePhoto(){
        System.out.println("Cделано фото.");
    }
}
