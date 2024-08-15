package homework.homework3.factory;

import homework.homework3.factory.phone.Samsung;
import homework.homework3.factory.phone_components.Camera;
import homework.homework3.factory.phone_components.Case;
import homework.homework3.factory.phone_components.Processor;

public class FactorySamsung {
    public static Samsung createSamsung() {
        Processor processor = new Processor(1500);
        Camera camera = new Camera(16);
        Case casePhone = new Case(60, 200, 10);
        return new Samsung(processor, camera, casePhone);
    }
}
