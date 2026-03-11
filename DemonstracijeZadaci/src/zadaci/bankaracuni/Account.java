package zadaci.bankaracuni;

public class Account {
    private String accountNum;
    private double funds;
    private int password;

    public Account(String accountNum, double funds, int password) {
        this.accountNum = accountNum;
        this.funds = funds;
        this.password = password;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public double getFunds() {
        return funds;
    }

    public void checkFunds(int password){
        if(password == this.password){
            System.out.println("Current funds: " + getFunds());
        }else{
            System.out.println("Incorrect password");
        }
    }

    public void deposit(double amount){
        this.funds += amount;
    }

    public void withdraw(double amount,int password){
        if(password == this.password && getFunds() >= amount){
            this.funds -= amount;
            System.out.println("Withdrawn " + amount);
        }else{
            System.out.println("Incorrect password");
        }
    }

    public void changePassword(int password,int newPassword){
        if(password == this.password){
            this.password = newPassword;
            System.out.println("Password changed");
        }else{
            System.out.println("Incorrect password");
        }
    }
}
