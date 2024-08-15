package homework.homework3.factory;

import homework.homework3.factory.phone.Iphone;
import homework.homework3.factory.phone.Samsung;

public class Runner {
    public static void main(String[] args) {
        Samsung samsung = FactorySamsung.createSamsung();
        samsung.takePhoto();

        Iphone iphone = FactoryIphone.creatIphone();
        iphone.takePhoto();
        iphone.printProcessors();
    }
}
