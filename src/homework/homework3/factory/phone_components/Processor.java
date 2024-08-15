package homework.homework3.factory.phone_components;

public class Processor {
    // Колличество вычеслений в секунду
    private int mhz;

    public Processor(int mhz) {
        this.mhz = mhz;
    }

    public int getMhz() {
        return mhz;
    }
}
