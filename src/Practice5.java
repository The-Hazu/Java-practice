import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        System.out.println("Введите число(a): ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Введите число(b): ");
        double b = sc.nextDouble();
        System.out.println("Введите операцию (+-*/): ");
        String op = sc.next();
        switch (op){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }
    }
}