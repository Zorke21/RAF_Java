package zadaci;

import java.util.Scanner;

/**
 * Digitalni Bankomat
 * 
 * Program simulira rad jednostavnog bankomata kroz interakciju u konzoli.
 * 
 * Pravila:
 * 1. PIN kod je "1234" (string). Korisnik ima 3 pokušaja da unese ispravan PIN.
 *    Nakon svakog pogrešnog unosa, na ekranu se ispisuje broj preostalih pokušaja.
 *    Ako korisnik unese pogrešan PIN 3 puta, bankomat se gasi uz odgovarajuću poruku.
 * 
 * 2. Ako se PIN ispravno unese, prikazuje se glavni meni i korisnik ulazi 
 *    u 'do-while' petlju sa sledećim opcijama (uz početno stanje računa od 5000 din):
 *    - 1. Podigni novac (uz proveru da li ima dovoljno sredstava i da je iznos pozitivan)
 *    - 2. Uplati novac (uz proveru da je iznos pozitivan)
 *    - 3. Istorija transakcija (prikazuje sve dosadašnje akcije)
 *    - 4. Izlaz (završava rad)
 * 
 * 3. Sve transakcije (npr. "- Podignuto 1000 din", "+ Uplaćeno 500 din") moraju 
 *    biti formatirane i čuvane u jednom StringBuilder objektu kako bi se ispisale
 *    kada korisnik odabere opciju "Istorija transakcija".
 */
public class DigitalniBankomat {
    public static void main(String[] args) {
        boolean correctPassword = false;
        String password = "1234";
        int passwordTries = 3;

        try(Scanner sc = new Scanner(System.in)){
            while(passwordTries > 0 && !correctPassword){
                System.out.print("EnterPassword: ");

                if(sc.next().toString().equals(password)){
                    correctPassword = true;
                    passwordTries = 0;
                    System.out.println("Opening ATM service");
                }else{
                    passwordTries--;
                    System.out.println("Incorrect password\nNumber of tries remaining: " + passwordTries);
                }
            }
                if(correctPassword){
                    StringBuilder transactionHistory = new StringBuilder();

                    transactionHistory.append("CurrentFunds:5000din\n----------------------------");
                    System.out.println("\n1. Podigni novac (uz proveru da li ima dovoljno sredstava i da je iznos pozitivan)\n" +
                            "2. Uplati novac (uz proveru da je iznos pozitivan)\n" +
                            "3. Istorija transakcija (prikazuje sve dosadašnje akcije)\n" +
                            "4. Izlaz (završava rad)");
                            String entry = "";
                    do {
                        entry = sc.next();
                        if(entry.equals("1") || entry.equals("Podigni novac")){
                            System.out.println("Koliko zelite podici?");
                            double withdraw = sc.nextDouble();
                            double funds = Double.parseDouble(transactionHistory.substring(transactionHistory.indexOf(":")+1
                                    ,transactionHistory.indexOf("din")));

                            if(withdraw > funds){
                                System.out.println("Nedovoljno sredstava");
                            } else if (withdraw < 0) {
                                System.out.println("Negativne vrednosti nisu dozvoljene");
                            }else{
                                funds = funds - withdraw;
                                transactionHistory.replace(transactionHistory.indexOf(":")+1
                                        ,transactionHistory.indexOf("din"),Double.toString(funds));
                                transactionHistory.append("\nMoney withdrawn -")
                                        .append(withdraw)
                                        .append("din");
                            }
                            System.out.println("\n1. Podigni novac (uz proveru da li ima dovoljno sredstava i da je iznos pozitivan)\n" +
                                    "2. Uplati novac (uz proveru da je iznos pozitivan)\n" +
                                    "3. Istorija transakcija (prikazuje sve dosadašnje akcije)\n" +
                                    "4. Izlaz (završava rad)");
                        }else if(entry.equals("2") || entry.equals("Uplati novac")){
                            System.out.println("Koliko zelite uplatiti?");
                            double deposit = sc.nextDouble();
                            double funds = Double.parseDouble(transactionHistory.substring(transactionHistory.indexOf(":")+1
                                    ,transactionHistory.indexOf("din")));

                            if (deposit < 0) {
                                System.out.println("Negativne vrednosti nisu dozvoljene");
                            }else{
                                funds = funds + deposit;

                                transactionHistory.replace(transactionHistory.indexOf(":")+1
                                        ,transactionHistory.indexOf("din"),Double.toString(funds));
                                transactionHistory.append("\nMoney deposited +")
                                                  .append(deposit)
                                                  .append("din");
                            }
                            System.out.println("\n1. Podigni novac (uz proveru da li ima dovoljno sredstava i da je iznos pozitivan)\n" +
                                    "2. Uplati novac (uz proveru da je iznos pozitivan)\n" +
                                    "3. Istorija transakcija (prikazuje sve dosadašnje akcije)\n" +
                                    "4. Izlaz (završava rad)");
                        } else if (entry.equals("3") || entry.equals("Istorija transakcija")) {
                            System.out.println(transactionHistory);
                            System.out.println("\n1. Podigni novac (uz proveru da li ima dovoljno sredstava i da je iznos pozitivan)\n" +
                                    "2. Uplati novac (uz proveru da je iznos pozitivan)\n" +
                                    "3. Istorija transakcija (prikazuje sve dosadašnje akcije)\n" +
                                    "4. Izlaz (završava rad)");
                        }else if(entry.equals("4") || entry.equals("Exit") ){
                            System.out.println("Exiting ATM service");
                        }else{
                            System.out.println("Invalid command");
                        }
                    }while(!entry.equals("4") && !entry.equals("Exit") );
                }else{
                    System.out.println("Number of tries exceeded\nATM blocked");
                }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
