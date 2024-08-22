package homework.homework4.ex3;

public class Builder extends Man{
    private static final String BUILDERS_SOUND = "Я строитель";
    @Override
    public void makeSound() {
        System.out.println(BUILDERS_SOUND + ". " + MANS_SOUND);
    }
}
