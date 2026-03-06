package nizovi;

import java.util.Arrays;

public class Nizovi {
    public static void main(String[] args) {

        // Kreiranje i pristup elementima
        int[] niz = {10, 20, 30};

        System.out.println("Prvi element: " + niz[0]);
        System.out.println("Poslednji element: " + niz[niz.length - 1]);
        System.out.println("Duzina niza: " + niz.length);


        // Ispis niza
        System.out.println(Arrays.toString(niz));


        // Kopiranje niza
        int[] noviNiz = Arrays.copyOf(niz, niz.length + 1);
        noviNiz[noviNiz.length - 1] = 40;

        System.out.println(Arrays.toString(noviNiz));


        // Prolazak kroz niz
        for (int i = 0; i < niz.length; i++) {
            System.out.println("for: " + niz[i]);
        }

        // For-each prolazak kroz niz
        for (int broj : niz) {
            System.out.println("for-each: " + broj);
        }

        // Dvodimenzionalni niz (matrica)
        int[][] matrica = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int[] red : matrica) {
            for (int element : red) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        // Split stringa u niz
        String recenica = "Jabuka, Kivi, Banana";
        String[] voce = recenica.split(", ");

        System.out.println(Arrays.toString(voce));
    }
}


