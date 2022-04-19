package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Jack";
//        player.health = 25;
//        player.weapon = "Sword";
//
//        int damage = 12;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 15;
//        player.health = 205;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Jack", 250, "Lance");
        System.out.println("Initial health is " + player.getHealth());
    }
}
