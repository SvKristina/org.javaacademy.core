package homework.homework4.ex1;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(true, 5, 2, 1.8, true),
                new Car(true, 5, 2, 1.8, true),
                new Car(true, 5, 2, 1.8, true),
                new Car(true, 5, 2, 1.8, true),
        };

        Bus[] buses = {
                new Bus(true, 12, 3, 2.3, 90),
                new Bus(true, 12, 3, 2.3, 90),
                new Bus(true, 12, 3, 2.3, 90),
                new Bus(true, 12, 3, 2.3, 90),
                new Bus(true, 12, 3, 2.3, 90),
        };

        CarWash carWash = new CarWash();
        int totalCost = carWash.wash(cars) + carWash.wash(buses);

        System.out.printf("Мэрия заплатит %s рублей за мойку машин.", totalCost);
    }
}
