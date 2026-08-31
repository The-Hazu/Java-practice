import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverterService  converter = new CurrencyConverterService();
        System.out.println("Введите исходную валюту (KZT, RUB, USD): ");
        String from = sc.nextLine();
        System.out.println("Введите целевую валюту (KZT, RUB, USD): ");
        String to = sc.nextLine();
        System.out.println("Введите сумму для конвертации: ");
        String amoutInput = sc.nextLine();
        BigDecimal amount = new BigDecimal(amoutInput);
        BigDecimal result = converter.convert(from, to, amount);
        if (result.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Ошибка: Данная валютная пара не поддерживается банком.");
        } else {
            System.out.println("Результат конвертации: " + result + " " + to);
        }
    }
}
class CurrencyPair {
    private final String from;
    private final String to;
    private final BigDecimal rate;
    CurrencyPair(String from, String to, BigDecimal rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    public BigDecimal getRate() {
        return rate;
    }
}
class CurrencyConverterService {
    private final CurrencyPair[] pairs = new CurrencyPair[]{
            new CurrencyPair("RUB", "USD", new BigDecimal("0.011577")),
            new CurrencyPair("RUB", "KZT", new BigDecimal("5.38")),
            new CurrencyPair("USD", "KZT", new BigDecimal("461.07")),
            new CurrencyPair("USD", "RUB", new BigDecimal("86.38")),
            new CurrencyPair("KZT", "RUB", new BigDecimal("0.1859")),
            new CurrencyPair("KZT", "USD", new BigDecimal("0.002169")),
    };
    public BigDecimal convert(String from, String to, BigDecimal amount) {
        for (CurrencyPair pair : pairs) {
            if (pair.getFrom().equalsIgnoreCase(from) && pair.getTo().equalsIgnoreCase(to)) {
                return amount.multiply(pair.getRate()).setScale(6, RoundingMode.HALF_UP);
            }
        }
        return BigDecimal.ZERO;
    }
}