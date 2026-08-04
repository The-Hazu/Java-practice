import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температурную шкалу(Цельсия, Фаренгейт, Кельвин): ");
        String temp = sc.nextLine();
        System.out.print("Введите значение: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        switch(temp) {
            case "Цельсия":
                System.out.println("Перевести градус Кельвина или в градус Фаренгейта?");
                String option = sc.nextLine();
                switch (option) {
                    case "Кельвин":
                        System.out.println(amount + " градус Цельсия -> " + (amount + 274.15) + "градус Кельвина");
                        break;
                    case "Фаренгейт":
                        System.out.println(amount + " градус Цельсия -> " + ((amount * 9 / 5) + 32) + "градус Фаренгейта");
                        break;
                }
                break;
            case "Фаренгейт":
                System.out.println("Перевести градус Кельвина или в градус Цельсия?");
                String option2 = sc.nextLine();
                switch (option2) {
                    case "Кельвин":
                        System.out.println(amount + " градус Фаренгейта -> " + ((amount - 32) * 5 / 9 + 273.15) + "градус Кельвина");
                        break;
                    case "Цельсия":
                        System.out.println(amount + " градус Фаренгейта -> " + ((amount - 32) * 5 / 9) + "градус Цельсия");
                        break;
                }
                break;
            case "Кельвин":
                System.out.println("Перевести градус Цельсия или в градус Фаренгейта?");
                String option3 = sc.nextLine();
                switch (option3) {
                    case "Фаренгейт":
                        System.out.println(amount + " градус Кельвина -> " + ((amount - 273.15) * 9 / 5 + 32) + "градус Фаренгейта");
                        break;
                    case "Цельсия":
                        System.out.println(amount + " градус Кельвина -> " + (amount - 273.15) + "градус Цельсия");
                        break;
                }
                break;
        }
    }
}