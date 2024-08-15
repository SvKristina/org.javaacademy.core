package homework.homework2.office;

public class Office {
    private final String name;

    private Office boss;
    private Office manager;
    private Office guard;
    private Office secretary;

    public Office(String newName) {
        this.name = newName;
    }

    public Office() {
        this.name = "Секретарь";
    }

    public String getName() {
        return name;
    }

    public void setBoss(Office boss) {
        this.boss = boss;
    }

    public void setManager(Office manager) {
        this.manager = manager;
    }

    public void setGuard(Office guard) {
        this.guard = guard;
    }

    public void bossCallsManager() {
        System.out.println( manager.getName() + ", быстрее!" );
    }

    public void managerScreams() {
        System.out.println( "Я ничего не успеваю, помогите!" );
    }

    public void secretarySays() {
        System.out.println( boss.getName() + ", не волнуйтесь, " + manager.getName() + " все успеет. "
                + guard.getName() + " - подождите!" );
    }

    public void guardAsks() {
        System.out.println( "Дайте пожалуйста аванс!" );
    }

    public void workingDay() {
        bossCallsManager();
        managerScreams();
        secretarySays();
        guardAsks();
    }
}
