package homework.homework4.ex4;

/**
 * Хищник
 */
public abstract class Predator extends Alive{
    public Predator(double weight) {
        super(weight);
    }

    public void attack(Alive sacrifice) throws AnimalIsDeadException {
        if (!isAlive){
            throw new AnimalIsDeadException("Животное мертвое и не может нападать");
        }

        if (!sacrifice.isAlive()){
            System.out.println("Животное не может нападать");
            return;
        }

        if (sacrifice.getWeight() > this.weight){
            this.die();
            System.out.println("Хищник погиб, так как жертва была слишком большой для него него.");
        } else {
            this.weight += sacrifice.getWeight() / 3;
            sacrifice.die();
            System.out.println("Хищник съел жертву. Теперь его вес: " + this.weight + ".");
        }
    }
}
