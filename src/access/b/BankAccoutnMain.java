package access.b;

public class BankAccoutnMain {
    public static void main(String[] args) {
        BankAccount bankAccount =  new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(300);
        System.out.println("balance: " + bankAccount.getBalance());

    }
}
