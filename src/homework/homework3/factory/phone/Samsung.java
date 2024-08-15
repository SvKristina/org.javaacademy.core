package homework.homework3.factory.phone;

import homework.homework3.factory.phone_components.Camera;
import homework.homework3.factory.phone_components.Case;
import homework.homework3.factory.phone_components.Processor;

public class Samsung extends Phone{
    public Samsung(Processor processor, Camera camera, Case casePhone) {
        super(new Processor[]{processor}, camera, casePhone);
    }

    @Override
    public void takePhoto() {
        camera.takePhoto();
    }
}
