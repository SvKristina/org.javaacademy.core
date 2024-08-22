package homework.homework4.ex2;

public class Runner {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck(false), new Duck(true)};

        for (Duck object : ducks){
            try{
                object.fly();
            } catch (FlyException e){
                System.out.println("Ошибка: утка ранена");
            }
        }

        Plane[] plane ={new Plane(10), new Plane(-1)};
        for (Plane object : plane){
            try{
                object.fly();
            } catch (FlyException e){
                System.out.println("Ошибка: пассажиров в самолете меньше 0");
            }
        }
    }
}
