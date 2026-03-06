package kontrolatoka;

public class Grananje {
    public static void main(String[] args) {
        // IF - ELSE IF - ELSE
        int broj = 15;

        if (broj > 20) {
            System.out.println("Broj je veći od 20");
        } else if (broj > 10) {
            System.out.println("Broj je veći od 10, ali manji ili jednak 20");
        } else {
            System.out.println("Broj je 10 ili manji");
        }

        // TERNARNI OPERATOR
        int broj2 = 8;

        String rezultat = (broj2 % 2 == 0)
                ? "Broj je paran"
                : "Broj je neparan";

        System.out.println(rezultat);


        // SWITCH
        int dan = 3;

        switch (dan) {
            case 1:
                System.out.println("Ponedeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            default:
                System.out.println("Nepoznat dan");
        }
    }
}
