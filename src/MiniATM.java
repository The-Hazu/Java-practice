import java.util.Scanner;

public class MiniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bek = new BankAccount("Бекжан", 0 , "+7 700 975 8983");

        boolean run = true;
        while(run){
            System.out.println("|----------------------------------|\n" + "1. Показать счёт\n" + "2. Пополнить\n" + "3. Снять деньги\n" + "4. Выйти\n" + "|----------------------------------|\n" +  "\n" + "Выберите действие:" );
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    bek.showInfo();
                    break;
                case 2:
                    System.out.println("Введите сумму пополнения: ");
                    double depositAmount = sc.nextDouble();
                    bek.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Введите сумму снятия: ");
                    double withdrawAmount = sc.nextDouble();
                    bek.withdraw(withdrawAmount);
                    break;
                case 4:
                    run = false;
                    break;
                default:
            }
        }


    }
    static class BankAccount{
        private String owner;
        private double balance;
        private final String accountNumber;

        public BankAccount(String owner,double balance,String accountNumber){
            this.owner=owner;
            this.balance=balance;
            this.accountNumber=accountNumber;
        }
        public void deposit(double amount){
            if (amount < 100){
                System.out.println("Сумма должна быть не менее 100 KZT!");
            } else { System.out.println("Баланс пополнен на сумму: " + amount); balance += amount; }
            System.out.println("Текущий баланс: " + balance + " KZT");
        }
        public void withdraw(double amount){
            if (amount < 0){
                System.out.println("Сумма должна быть не менее 0 KZT!");
            }  else if (amount > balance) {
                System.out.println("Сумма снятия не должнна превышать баланс!");
            } else {
                balance -= amount;
            }
            System.out.println("Текущий баланс: " + balance + " KZT");
        }
        void showInfo() {
            System.out.println("Пользователь: " + owner);
            System.out.println("Баланс: " + balance);
            System.out.println("Номер: " + accountNumber);
        }
    }
}
