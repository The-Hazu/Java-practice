import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        boolean[] field = new boolean[5];
        int mineIndex = new Random().nextInt(field.length);
        field[mineIndex] = true;
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.println("Введите номер ячейки от 1 до 5:");
            if (!sc.hasNextInt()) {
                System.out.println("Ошибка! Вы ввели не число. Попробуйте еще раз.");
                sc.next();
                continue;
            }
            int num = sc.nextInt();
            int checkIndex = num - 1;
            if (field[checkIndex] == true) {
                System.out.println("Вы проиграли лол!");
                break;
            } else {
                System.out.println("А ты везунчик.");
                score += 100;
                System.out.println("Ваш счет: " + score);
                if (score == 400) {
                    System.out.println("Поздравляю! Вы победили и награждаетесь званием сапёр года!");
                    break;
                }
            }
        }
    }
}
