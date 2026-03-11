package zadaci.bankaracuni;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public boolean accountExists(String accountNum){
        for(Account account : accounts){
            if(accountNum.equals(account.getAccountNum())){
                return true;
            }
        }
        return false;
    }

    public Account findAccount(String accountNum){
        for(Account account : accounts){
            if(accountNum.equals(account.getAccountNum())){
                return account;
            }
        }
        return null;
    }
}
