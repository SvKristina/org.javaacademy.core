package homework.homework4.ex3;


public class Man implements MakingSound{
    protected static final String MANS_SOUND = "Я человек";

    @Override
    public void makeSound() {
        System.out.println(MANS_SOUND);
    }
}
