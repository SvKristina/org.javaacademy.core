package homework.homework4.ex4;

public abstract class Alive {
    protected boolean isAlive = true;
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public double getWeight() {
        return weight;
    }

    public void die(){
        this.isAlive = false;
    }
}
