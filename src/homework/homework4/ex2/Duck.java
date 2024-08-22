package homework.homework4.ex2;

public class Duck implements Flyable{
    boolean isInjured = false;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured){
            throw new FlyException("Ошибка: утка ранена");
        }
        System.out.println("утка летит");
    }
}
