package homework.homework4.ex1;

public class Automobile {
    boolean isDirty;
    double length;
    double height;
    double width;

    public Automobile(boolean isDirty, double length, double height, double width) {
        this.isDirty = isDirty;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public boolean isLarge(){
        return length > 6 || height > 2.5 || width > 2;
    }

    public void clean(){
        isDirty = false;
    }
}
