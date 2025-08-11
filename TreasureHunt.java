import java.util.Scanner;

public class TreasureHunt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int health = 100;
        int coins = 0;
        boolean gameover = false;

        System.out.println("=== Treasure Hunt Adventure ===");
        System.out.println("You start with 100 health and 0 coins.");

        while (!gameover) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Fight a monster (-20 health, +10 coins)");
            System.out.println("2. Search for treasure (-10 health, +20 coins)");
            System.out.println("3. Rest (+15 health, -5 coins)");
            System.out.println("4. Check status");
            System.out.println("5. Quit");
            System.out.print("Enter choice (1-5): ");

            int choice;
            choice = sc.nextInt();

            if (choice == 1) {
                health -= 20;
                coins += 10;
                System.out.println("You fought bravely! Health: " + health + ", Coins: " + coins);
            }
            else if (choice == 2) {
                health -= 10;
                coins += 20;
                System.out.println("You found treasure! Health: " + health + ", Coins: " + coins);
            }
            else if (choice == 3) {
                health += 15;
                coins -= 5;
                if (health > 100) health = 100;
                if (coins < 0) coins = 0;
                System.out.println(" You rested well! Health: " + health + ", Coins: " + coins);
            }
            else if (choice == 4) {
                System.out.println("Status → Health: " + health + ", Coins: " + coins);
            }
            else if (choice == 5) {
                System.out.println("You ended your adventure with " + coins + " coins.");
                gameover = true;
                continue;
            }
            else {
                System.out.println(" Invalid choice! Enter a number between 1 and 5.");
                continue;
            }

            if (coins >= 100 && health > 0) {
                System.out.println("You collected 100 coins and won the game!");
                gameover = true;
            }
            else if (health <= 0) {
                System.out.println("You ran out of health! Game Over.");
                gameover = true;
            }
        }

        sc.close();
    }
}
