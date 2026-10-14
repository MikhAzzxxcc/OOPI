public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1, 10000);

        System.out.println("ID счёта: " + account.getId());
        System.out.println("Начальный баланс: " + account.getBalance());

        account.deposit(5000);
        System.out.println("После пополнения: " + account.getBalance());

        account.withdraw(3000);
        System.out.println("После снятия: " + account.getBalance());

        account.withdraw(20000);
        System.out.println("Баланс: " + account.getBalance());
    }
}

