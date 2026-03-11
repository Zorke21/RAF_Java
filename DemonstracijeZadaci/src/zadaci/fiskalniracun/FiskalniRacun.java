package zadaci.fiskalniracun;

import java.io.File;
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
public class FiskalniRacun{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("racun.txt"));
            StringBuilder sb = new StringBuilder();
            double price = 0;
            boolean first = true;
            while(sc.hasNextLine()){
                String format = sc.nextLine();
                format = format.replace("\uFEFF","");
                if(format.startsWith("Kupac:")){
                    if(first){
                        sb.append("Fiskalni racun - ")
                          .append(format)
                          .append("\n---------------------------------\n");
                        first = false;
                    }else{
                        sb.append("---------------------------------\nUKUPNO ZA PLACANJE: ")
                          .append(price)
                          .append("\n");
                        price = 0;
                        System.out.println(sb);
                        sb.setLength(0);
                        sb.append("Fiskalni racun - ")
                          .append(format)
                          .append("\n---------------------------------\n");
                    }
                } else{
                    String[] split = format.split(";"); //0 - produkt 1 - cena 2 - kolicina
                    double fullPrice = Double.parseDouble(split[2]) * Double.parseDouble(split[1]);
                    price += fullPrice;
                    sb.append(split[0])
                      .append(split[2])
                      .append(" = ")
                      .append(String.format("%.2f",fullPrice))
                      .append("\n");
                }
            }
            sb.append("---------------------------------\nUKUPNO ZA PLACANJE: ")
              .append(String.format("%.2f",price))
              .append("\n");
            price = 0;
            System.out.println(sb);
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
