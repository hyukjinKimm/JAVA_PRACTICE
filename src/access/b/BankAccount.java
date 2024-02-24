package access.b;

public class BankAccount {
    private int balance;
    public BankAccount(){
        balance = 0;
    }
    // public 메서드: deposit

    public void deposit(int amount){
        if(isAmountValid(amount)){
            this.balance += amount;
        }
        else
        {
            System.out.println("유효하지 않는 금액입니다.");
        }


    }
    // public 메서드 출금: withdraw
    public void withdraw(int amount){
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;

        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }
    public int getBalance(){
        return balance;
    }
    private boolean isAmountValid(int amount){
        // 금액이 0 보다 커야함
        return amount > 0;
    }
}