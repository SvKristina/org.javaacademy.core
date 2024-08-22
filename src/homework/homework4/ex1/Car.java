package homework.homework4.ex1;

/**
 * Легковая машина
 */


public class Car extends Automobile {
    boolean hasCruiseControl;


    public Car(boolean isDirty, double length, double height, double width, boolean hasCruiseControl) {
        super(isDirty, length, height, width);
        this.hasCruiseControl = hasCruiseControl;
    }
}
