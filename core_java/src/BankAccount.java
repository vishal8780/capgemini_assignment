public class BankAccount {
    private String name;
    protected double balance;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;

    }
    public void deposite(double amount){
        this.balance += amount;

    }
    public boolean withdraw(double amount){
        if(balance>amount) {
            balance -= amount;
            return true;
        }
        else {
            return false;

        }
    }
}

class SavingAccount extends BankAccount{

}
class Bankdemo {
    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount();
        SavingAccount s = new SavingAccount();
        c.deposite(500.00);
        s.deposite(500.0);
        doWithdrawal(c);
        doWithdrawal(s);
    }

    public static void doWithdrawal(BankAccount acc) {
        boolean result = acc.withdraw(1000.00);
        if (result) {
            System.out.println("withdraw succesfull");
            System.out.println("withdraw failed");
        }
    }
}

class CurrentAccount extends BankAccount{

    public boolean withdraw(double amount) {
        balance -=amount;
        return true;
    }
}