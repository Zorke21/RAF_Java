package kontrolatoka;

import java.util.Scanner;

/**
 * Prethodni zadatak uraditi pomoću do-while petlje.
 */

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(),faktorijel = 1;
        do {
            faktorijel*=n;
            n--;
        }while(n>0);
        System.out.println("Faktorijel je " + faktorijel);
    }
}
