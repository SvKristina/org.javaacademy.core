package homework.homework4.ex1;

public class CarWash {
    static final int LARGE_AUTOMOBILE_RATE = 4000;
    static final int SMALL_AUTOMOBILE_RATE = 2000;

    public int wash(Automobile automobile){
        if (automobile.isDirty){
            automobile.clean();
            if (automobile.isLarge()){
                return LARGE_AUTOMOBILE_RATE;
            } else {
                return SMALL_AUTOMOBILE_RATE;
            }
        }
        return 0;
    }
    public int wash(Automobile[] automobiles){
        int totalCost = 0;
        for (Automobile automobile : automobiles){
            totalCost += wash(automobile);
        }
        return totalCost;
    }
}
