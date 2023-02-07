import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        int tries = 0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int goalNumber = random.nextInt(100);
        System.out.println("Я загадал число от 1 до 100! Попробуй угадай!");
        while (play) {
            int userNumber = input.nextInt();
            if (goalNumber < userNumber) {
                System.out.println("Моё число меньше!");
            }
            if (goalNumber > userNumber) {
                System.out.println("Моё число больше!");
            }
            if (userNumber == goalNumber) {
                System.out.println("Угадал! Количество попыток: " + tries);
                play = false;
            }
            tries++;
        }
    }
}
