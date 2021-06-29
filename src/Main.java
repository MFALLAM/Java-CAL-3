import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("загадывает случайное число от 0 до 9, у тебя есть 3 попытки.");
        gameStart();
    }


    public static void gameStart() {
        int randomNumber = random.nextInt(9);
        int inputNumber = -1;

        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка номер " + (i + 1));

            inputNumber = scanner.nextInt();

            if (randomNumber < inputNumber) System.out.println("больше!");
            if (randomNumber > inputNumber) System.out.println("меньше!");
            if (randomNumber == inputNumber) {

                System.out.println("угадали!");
                System.out.println("1 – повторить, 0 – нет");

                inputNumber = scanner.nextInt();

                if (inputNumber == 1) gameStart();
                else break;
            }
        }

        gameOver();

        if (inputNumber == 1) startOver(scanner.nextInt());
    }

    public static void gameOver() {
        System.out.println("Вы не угадали");
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
    }

    public static void startOver(int number) {
        if (number == 1) {
            gameStart();
        }
    }

}