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
    }
}
