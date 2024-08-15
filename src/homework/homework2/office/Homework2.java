package homework.homework2.office;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        System.out.println("___________________________________________");
        ex2();
        System.out.println("___________________________________________");
        ex3();
    }

    public static void ex1() {
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String sentence = "";
        for ( int i = 0; i < words.length; i++ ) {
            sentence += words[i] + "-";
        }
        System.out.println(sentence.substring(0, sentence.length() - 1));
    }

    public static void ex2() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;
        int d = arrayOfNumbers.length - 1;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
           leftUpToRightDownSum += arrayOfNumbers[i][i];
           leftDownToRightUpSum += arrayOfNumbers[i][d];
           d--;
        }

        System.out.println("Сумма диагонали идущей с левого верхнего угла к нижнему правому: "
                + leftUpToRightDownSum + ". Сумма диагонали идущей с левого нижнего угла к верхнему правому: "
                + leftDownToRightUpSum + ".");
    }

    public static void ex3(){
        Random random = new Random(1);
        int attemptNumber = 0;

        while (true) {
            int number = random.nextInt(1000);
            attemptNumber++;

            if (number == 999) {
                System.out.println(attemptNumber);
                return;
            }
        }

    }
}
