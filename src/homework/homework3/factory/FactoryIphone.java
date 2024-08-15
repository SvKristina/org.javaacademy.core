package homework.homework3.factory;

import homework.homework3.factory.phone.Iphone;
import homework.homework3.factory.phone_components.Camera;
import homework.homework3.factory.phone_components.Case;
import homework.homework3.factory.phone_components.Processor;

public class FactoryIphone  {
    public static Iphone creatIphone(){
        Processor[] processors ={new Processor(1000), new Processor(1000)};
        Camera camera = new Camera(8);
        Case casePhone = new Case(60, 200, 10);
        return new Iphone(processors, camera, casePhone);
    }

}
