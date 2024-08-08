package homework.office;

public class Runner {
    public static void main(String[] args) {
        Office bossName = new Office("Петр Николаевич");
        Office managerName = new Office("Володя");
        Office guardName = new Office("Петрович");

        Office start = new Office();

        start.setBoss(bossName);
        start.setGuard(guardName);
        start.setManager(managerName);

        start.workingDay();
    }
}
