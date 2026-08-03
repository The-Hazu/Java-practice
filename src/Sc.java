import java.util.Scanner;
public class Sc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = s.nextLine();
        System.out.println("Ваше имя: " + name);
    }
}
