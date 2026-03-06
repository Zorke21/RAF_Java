package nizovi;

import java.util.Arrays;

/**
 * Analiza prodaje u toku nedelje
 * Prodavnica prati broj prodatih proizvoda tokom sedam dana.
 * Podaci o prodaji čuvaju se u nizu celih brojeva, gde svaki element predstavlja broj prodatih proizvoda za jedan dan u nedelji.
 * Primer niza:
 * [2, 7, 15, 9, 20, 5, 18]
 * Izračunati ukupan broj prodatih proizvoda u toku nedelje.
 * Izračunati prosečnu dnevnu prodaju.
 * Pronaći dan sa najvećom prodajom.
 */
public class Zadatak1 {
    public static void main(String[] args) {
        int[] sales = {2, 7, 15, 9, 20, 5, 18};
        int salesAll = Arrays.stream(sales).sum(),max = Integer.MIN_VALUE,maxDay = 0;
        double avgSales;
        avgSales = salesAll / 7.0;
        for (int i = 0; i < 7; i++) {
            if(sales[i] > max){
                max = sales[i];
                maxDay = i+1;
            }
        }
        System.out.println("All: " + salesAll + " Avg: " + avgSales + " MaxDay: " + maxDay);
    }
}
