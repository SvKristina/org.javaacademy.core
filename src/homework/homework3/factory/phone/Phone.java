package homework.homework3.factory.phone;

import homework.homework3.factory.phone_components.Camera;
import homework.homework3.factory.phone_components.Case;
import homework.homework3.factory.phone_components.Processor;

public abstract class Phone {
    protected  Processor[] processors;
    protected Camera camera;
    protected Case casePhone;

    public Phone(Processor[] processors, Camera camera, Case casePhone) {
        this.processors = processors;
        this.camera = camera;
        this.casePhone = casePhone;
    }

    public abstract void takePhoto();
}
