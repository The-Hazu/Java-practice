import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите валюту (Рубль или Теңге): ");
        String value = sc.nextLine();
        System.out.print("Введите сумму: ");
        double amount = sc.nextDouble();
        if (value.equals("Рубль")) {
            System.out.println(amount + " рублей -> " + amount / 79 + "$");
        } else if (value.equals("Теңге")){
            System.out.println(amount + " тенге -> " + amount / 474 + "$");
        } else {
            System.out.println("Введите правильную валюту");
        }
    }
}
