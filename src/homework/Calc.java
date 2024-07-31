package homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        String sign = scanner.nextLine();
        System.out.println("Введите второе число");
        double numberTwo = scanner.nextDouble();
        String sign1 = "+";
        String sign2 = "-";
        String sign3 = "*";
        String sign4 = "/";

        if (sign1.equals(sign)){
            System.out.println("Ответ: " + (number1 + numberTwo));
        } else if (sign2.equals(sign)){
            System.out.println("Ответ: " + (number1 - numberTwo));
        } else if (sign3.equals(sign)){
            System.out.println("Ответ: " + (number1 * numberTwo));
        } else if (sign4.equals(sign)){
            System.out.println("Ответ: " + (number1 / numberTwo));
        } else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
