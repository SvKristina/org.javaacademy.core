package homework;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
    }

    public static void ex2() {
        String name = "     ПЕтРов Олег Иванович     ";
        String name2 = name.trim().toUpperCase();
        if (name2.contains("ОВ ")){
            System.out.println("Уважаемый " + name2);
        } else if (name2.contains("ОВА")){
            System.out.println("Уважаемая " + name2);
        } else {
            System.out.println("Неизвестное лицо " + name2);
        }
    }

    public static void ex3(){
        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (fuel >= 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors && isEngineWork) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }


    public static void ex4() {
        String simply = "this is simply. This is my favorite song.";
        String simply2 = simply.replace("this is",
                "those are").replace("This is", "Those are");
        System.out.println(simply2.indexOf('o', 4));
    }
}

