public class While {
    public static void main(String[] args) {
        int value = 0;
        while (value <= 10) {
            System.out.println("Значение: " + value);
            value = value + 1;
        }
        System.out.println("Finish");
    }
}