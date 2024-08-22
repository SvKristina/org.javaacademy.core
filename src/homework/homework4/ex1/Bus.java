package homework.homework4.ex1;

public class Bus extends Automobile{
    int maxCountOfPassengers;


    public Bus(boolean isDirty, double length, double height, double width, int maxCountOfPassengers) {
        super(isDirty, length, height, width);
        this.maxCountOfPassengers = maxCountOfPassengers;
    }
}
