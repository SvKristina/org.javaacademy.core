package homework.homework4.ex4;

public class Rabbit extends Herbivore{

    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void run() {
        try {
            checkIfCanRun();
        } catch (AnimalIsDeadException e) {
            System.out.println("Кролик не может бежать. Он мертв.");
            return;
        }
        System.out.println("кролик быстро бежит");
    }
}
