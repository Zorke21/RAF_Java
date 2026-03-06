package stringovi;

/**
 * Dat je string " Ana-2001 " koji sadrži ime i godinu rođenja razdvojene crticom, sa razmacima na početku i kraju.
 * Potrebno je ukloniti suvišne razmake,
 * zatim izdvojiti ime i godinu rođenja kao posebne vrednosti, izračunati koliko osoba ima godina
 * i ispisati sve u formatu: "Ana, 25"
 */

public class Zadatak1 {
    public static void main(String[] args) {
        String name = " Ana-2001 ";
        String tName = name.trim();
        String[] split = tName.split("-");
        int godiste = 2026 - Integer.parseInt(split[1]);
        StringBuilder sb = new StringBuilder();
        sb.append(split[0]).append(", ").append(godiste);
        System.out.println(sb);


    }
}
