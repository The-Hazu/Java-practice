import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int targetNumber = new Random().nextInt(100)+1;
        int attemptCount = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Введите число от 1 до 100: ");
            if (!sc.hasNextInt()) {
                System.out.println("Ошибка! Вы ввели не число. Попробуйте еще раз.");
                sc.next();
                continue;
            }
            int amount = sc.nextInt();
            attemptCount += 1;
            System.out.println("Попыток: " + attemptCount);
            if (amount == targetNumber) {
                System.out.println("Победа!");
                break;
            } else if (amount < targetNumber) {
                System.out.println("Больше");
            } else {
                System.out.println("Меньше");
            }
        }
    }
}