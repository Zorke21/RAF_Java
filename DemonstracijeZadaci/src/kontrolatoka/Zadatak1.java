package kontrolatoka;

import java.util.Scanner;

/**
 * Za dati broj (int) izračunati njegov faktorijel
 */

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(),faktorijel = 1;

        for (long i = n; i > 0; i--) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel je " + faktorijel);
    }
}
