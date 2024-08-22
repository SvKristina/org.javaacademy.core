package homework.homework4.ex4;

public class Tiger extends Predator{

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void attack(Alive sacrifice) throws AnimalIsDeadException {
        if (!isAlive){
            throw new AnimalIsDeadException("Животное мертво и не может нападать");
        }

        if (!sacrifice.isAlive()){
            System.out.println("Животное не может нападать");
            return;
        }

        if (sacrifice.getWeight() > this.weight * 2){
            this.die();
            System.out.println("Тигр погиб, так как жертва была слишком большой для него него.");
        } else {
            this.weight += sacrifice.getWeight() / 3;
            sacrifice.die();
            System.out.println("Тигр съел жертву. Теперь его вес: " + this.weight + ".");
        }
    }
}
