import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите валюту: ");
        String value = sc.nextLine();
        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        if (value.equals("Рубль")) {
            System.out.println("Перевести в Доллар или в Теңге: ");
            String convert = sc.nextLine();
            if (convert.equals("Доллар")) {
                System.out.println(amount + " Рубль -> " + amount / 79 + "$");
            } else if ((convert.equals("Теңге"))) {
                System.out.println(amount + " Рубль " + amount *  6 + "Теңге");
            } else {
                System.out.println("Введите правильную валюту");
            }
        } else if (value.equals("Теңге")) {
            System.out.println("Перевести в Доллар или в Рубль: ");
            String transfer = sc.nextLine();
            if (transfer.equals("Доллар")) {
                System.out.println(amount + " Теңге -> " + amount / 474 + " $");
            } else if (transfer.equals("Рубль")) {
                System.out.println(amount + " Теңге -> " + amount / 6 + " Рублей");
            }  else {
                System.out.println("Введите правильную валюту");
            }
        } else if (value.equals("Доллар")) {
            System.out.println("Перевести в Рубль или Теңге?");
            String target = sc.nextLine();
            if (target.equals("Теңге")) {
                System.out.println(amount + " Доллар -> " + amount * 474 + " Теңге");
            } else if (target.equals("Рубль")) {
                System.out.println(amount + " Доллар -> " + amount * 79 + " Рублей");
            } else {
                System.out.println("Введите правильную валюту");
            }
        } else {
            System.out.println("Введите правильную валюту");
        }
    }
}