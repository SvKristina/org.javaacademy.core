package homework.homework3.factory.phone;

import homework.homework3.factory.phone_components.Camera;
import homework.homework3.factory.phone_components.Case;
import homework.homework3.factory.phone_components.Processor;

public class Iphone extends Phone{
    public Iphone(Processor[] processors, Camera camera, Case casePhone) {
        super(processors, camera, casePhone);
    }

    @Override
    public void takePhoto() {
        camera.takePhoto();
    }

    public void printProcessors() {
        for (Processor processor : processors) {
            System.out.println("Процессор с частотой: " + processor.getMhz() + " Mhz");
        }
    }
}
