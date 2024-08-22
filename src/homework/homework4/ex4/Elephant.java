package homework.homework4.ex4;

public class Elephant extends Herbivore{

    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() {
        try {
            checkIfCanRun();
        } catch (AnimalIsDeadException e) {
            System.out.println("Ошибка: слон мертв и не может бежать.");;
        }
        System.out.println("слон медленно бежит");
    }
}
