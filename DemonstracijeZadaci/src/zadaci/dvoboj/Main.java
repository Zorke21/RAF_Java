package zadaci.dvoboj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        int trainValue, retired = -1;
        Knight player = new Knight("Corvus",25);
        Knight pissbaby = new Knight("PissBaby",10);
        Knight jakito = new Knight("Jakito",100);
        Knight maurice = new Knight("Maurice",175);
        ArrayList<Knight> knights = new ArrayList<>();
        knights.add(player);
        knights.add(jakito);
        knights.add(maurice);
        knights.add(pissbaby);
        /*  1. Stats
            2. Train
            3. Fight pissbaby
            4. Fight jakito
            5. Fight Greg
            6. Close
         */
        System.out.println("Input desired action: \n1. View stats \n2. Train \n3. Fight an opponent \n4. Close");
        do {
            input = scanner.nextLine();
            if(input.equals("1")){
                player.knightInfo();
            } else if (input.equals("2")) {
                trainValue = scanner.nextInt();
                scanner.nextLine();
                player.train(trainValue);
            } else if (input.equals("3")) {
                System.out.println("Choose opponent \n1.PissBaby power: " + pissbaby.getPower() +
                        "\n2.Jakito power: " + jakito.getPower() + "\n3.Maurice power" + maurice.getPower());
                input = scanner.nextLine();
                if (input.equals("1")) {
                    player.fight(pissbaby);
                } else if (input.equals("2")) {
                    player.fight(jakito);
                } else if (input.equals("3")) {
                    player.fight(maurice);
                }
            } else if (input.equals("4")) {
                continue;
            }else{
                System.out.println("Invalid command");
                continue;
            }

            if (knights.size() == 1){
                System.out.println("You won!");
                input = "4";
            }else{
                retired = -1;
                for (Knight knight : knights){
                    if (knight.getPower() <= 0) {
                        System.out.println(knight.getName() + " (RETIRED)");
                        retired = knights.indexOf(knight);

                        if(knight == player){
                            System.out.println("You lost!");
                            input = "4";
                        }

                    }
                }
                if(retired >= 0){
                    knights.remove(retired);
                }

            }
        }while(!input.equals("4"));
        scanner.close();
    }



}
