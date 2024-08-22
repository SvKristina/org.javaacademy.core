package homework.homework4.ex4;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Runner {
    public static void main(String[] args) throws AnimalIsDeadException {
        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);

        rabbit.run();

        wolf.attack(rabbit);

        tiger.attack(wolf);

        try {
            tiger.attack(elephant);
        } catch (AnimalIsDeadException e){
            System.out.println(e.getMessage());
        }

        elephant.run();

        rabbit.run();
    }
}
