package zadaci;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Ulazni fajl ("rezultati.txt") sadrži podatke o studentima u svakom redu, 
 * odvojene zarezom: Ime Prezime, Godina/Broj Smer, Broj Poena.
 * Primer:
 * 
 * Marko Markovic, 2023/0012 SI, 85
 * Ana Anic, 2023/0145 RN, 42
 * Petar Petrovic, 2022/0888 RI, 51
 * 
 * Potrebno je implementirati program koji učitava podatke o studentima iz
 * ulaznog tekstualnog fajla. Svaka linija fajla sadrži podatke o jednom studentu.
 *
 * Zadatak programa je da izdvoji sve studente koji su položili ispit,
 * odnosno koji imaju 51 ili više osvojenih poena.
 *
 * Za studente koji su položili, potrebno je kreirati novi izlazni fajl
 * pod nazivom "polozili.txt" i u njega upisati podatke u sledećem formatu:
 *
 * BrojIndeksa - Prezime Ime (Poeni)
 */

public class ObradaRezultata {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("rezultati.txt"));

            FileWriter writer = new FileWriter("polozili.txt");
            writer.write("");
            while(scanner.hasNextLine()) {
                String format = scanner.nextLine();

                format = format.replace("\uFEFF","");

                System.out.println(format);
                String[] splitMain = format.split(", ");

                if(Integer.parseInt(splitMain[2]) < 51){
                    continue;
                }

                String[] ime = splitMain[0].split(" ");
                String index = splitMain[1].split("/")[1].split(" ")[0];

                writer.append(index + " - " + ime[1] + " " + ime[0] + "(" + splitMain[2] + ")" + "\n");
            }
            writer.close();
            scanner.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
