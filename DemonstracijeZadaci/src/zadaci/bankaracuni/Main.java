package zadaci.bankaracuni;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            String input;
            Double inputFunds;
            int inputPassword,newPassword;
            Account acc1 = new Account("001", 5000, 342);
            Account acc2 = new Account("002", 100, 856);
            Account acc3 = new Account("003", 99999, 271);
            Bank bank = new Bank(new ArrayList<>());
            bank.addAccount(acc1);
            bank.addAccount(acc2);
            bank.addAccount(acc3);

            System.out.println("Search up if account exists");
            while (!(input = scanner.nextLine()).equals("exit")) {
                if (bank.accountExists(input)) {
                    System.out.println("Account exists");
                } else {
                    System.out.println("Account doesnt exist");
                }
            }
            System.out.println("Enter deposit");
            inputFunds = scanner.nextDouble();
            acc1.deposit(inputFunds);
            System.out.println("Enter password");
            inputPassword = scanner.nextInt();
            acc1.checkFunds(inputPassword);


            System.out.println("How much monei take");
            inputFunds = scanner.nextDouble();
            System.out.println("Enter password");
            inputPassword = scanner.nextInt();
            acc1.withdraw(inputFunds,inputPassword);

            System.out.println("Enter password");
            inputPassword = scanner.nextInt();
            acc1.checkFunds(inputPassword);
            System.out.println("Enter password");
            inputPassword = scanner.nextInt();
            System.out.println("Enter new password");
            newPassword = scanner.nextInt();
            acc1.changePassword(newPassword,inputPassword);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
