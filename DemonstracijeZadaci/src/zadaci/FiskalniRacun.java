package zadaci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ulazni fajl ("racun.txt") sadrži podatke o više kupaca i njihovim računima.
 * Početak računa svakog kupca je uvek označen redom koji počinje sa "Kupac: ",
 * a u svim narednim redovima do sledećeg kupca nalaze se detalji o kupljenim 
 * artiklima odvojeni tačka-zarezom: NazivArtikla;Cena;Količina
 * 
 * Primer:
 * Kupac: Pera Peric
 * Mleko;150.5;2
 * Hleb;80.0;1
 * Kupac: Ana Anic
 * Cokolada;120.0;3
 * 
 * Potrebno je implementirati program koji učitava ovakav fajl i obrađuje sve
 * račune redom, a zatim ispisuje u konzolu svaki formatiran račun, odvojen 
 * praznim redom.
 *
 * Primer:
 * Fiskalni racun - Kupac: Ana Anic
 * ---------------------------------
 * Testenina Fusilli 500g x 2 = 360.0
 * Pavlaka za kuvanje x 1 = 240.5
 * ---------------------------------
 * UKUPNO ZA PLACANJE: 600.5
 * 
 */
public class FiskalniRacun {
    public static void main(String[] args) {

    }
}
