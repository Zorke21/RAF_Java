package kontrolatoka;

public class Petlje {
    public static void main(String[] args) {
        // WHILE
        int i = 1;

        while (i <= 5) {
            System.out.println("while: " + i);
            i++;
        }

        // DO-WHILE
        int j = 1;

        do {
            System.out.println("do-while: " + j);
            j++;
        } while (j <= 5);

        // FOR
        for (int k = 1; k <= 5; k++) {
            System.out.println("for: " + k);
        }

        // FOR-EACH
        int[] niz = {10, 20, 30};

        for (int broj : niz) {
            System.out.println("for-each: " + broj);
        }
    }
}
