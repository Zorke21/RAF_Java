package zadaci.dvoboj;

public class Knight {
    private String name;
    private int power;
    private int points = 0;

    public Knight(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public Knight(String name) {
        this.name = name;
        this.power = 0;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void train(int value){
        this.power += value;
        System.out.println(this.name + " Trains...\n  and increases his power by " + value + ",new power rating: " + this.power);
    }

    public void help(Knight helper,int value){
        if(helper.power > value){
            this.power +=value;
            helper.power -= value;
            System.out.println(helper.name + " has helped " + this.name + " and given him " + value + " power");
        }else{
            System.out.println(helper.name + " doesnt have the needed power to help " + this.name);
        }
    }

    public void fight(Knight challenger){
        System.out.println(this.name + " challenges " + challenger.name + " to a duel");
        if(this.power > challenger.power){
            challenger.power -= 20;
            this.points++;
            System.out.println(this.name + " has won the duel and earned one point");
        }else if(challenger.power > this.power){
            this.power -= 20;
            challenger.points++;
            System.out.println(challenger.name + " has won the duel and earned one point");
        }else{
            this.power -= 5;
            challenger.power -=5;
            System.out.println("The match has ended in a draw");
        }
    }

    public void knightInfo(){
        System.out.println("Name: " + this.name + "\nPower: " + this.power + "\nPoints: " + this.points);
    }
}
