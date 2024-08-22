package homework.homework4.ex4;

/**
 * Травоядное
 */

public abstract class Herbivore extends Alive {

    public Herbivore(double weight) {
        super(weight);
    }

    public abstract void run();

    protected void checkIfCanRun() throws AnimalIsDeadException{
        if (!isAlive){
            throw new AnimalIsDeadException("Животное не может бегать");
        }
    }
}
