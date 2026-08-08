import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите исходную валюту: ");
        String fromCurrency = sc.nextLine();
        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        if (fromCurrency.equals("Рубль")) {
            System.out.print("Перевести в Доллар или Теңге: ");
            String toCurrency = sc.nextLine();
            if (toCurrency.equals("Доллар")) {
                System.out.println(amount + " ₽ -> " + amount / 79 + " $");
            } else if (toCurrency.equals("Теңге")) {
                System.out.println(amount + " ₽ -> " + amount * 6 + " ₸");
            } else {
                System.out.println("Ошибка: неизвестная валюта.");
            }
        } else if (fromCurrency.equals("Теңге")) {
            System.out.print("Перевести в Доллар или Рубль: ");
            String toCurrency = sc.nextLine();
            if (toCurrency.equals("Доллар")) {
                System.out.println(amount + " ₸ -> " + amount / 474 + " $");
            } else if (toCurrency.equals("Рубль")) {
                System.out.println(amount + " ₸ -> " + amount / 6 + " ₽");
            } else {
                System.out.println("Ошибка: неизвестная валюта.");
            }
        } else if (fromCurrency.equals("Доллар")) {
            System.out.print("Перевести в Рубль или Теңге: ");
            String toCurrency = sc.nextLine();
            if (toCurrency.equals("Теңге")) {
                System.out.println(amount + " $ -> " + amount * 474 + " ₸");
            } else if (toCurrency.equals("Рубль")) {
                System.out.println(amount + " $ -> " + amount * 79 + " ₽");
            } else {
                System.out.println("Ошибка: неизвестная валюта.");
            }
        } else {
            System.out.println("Ошибка: неизвестная исходная валюта.");
        }
    }
}