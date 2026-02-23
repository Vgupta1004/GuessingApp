/**
 * Handles game lifecycle decisions.
 * 
 * This class is responsible for deciding
 * whether the game should restart or exit
 * based on user choice.
 */
import java.util.Scanner;
public class GameController {
    /**
     * Asks the player if they want to
     * restart the game after completion.
     * 
     * Returns true if the game should restart,
     * false if the application should exit.
     */

    public static boolean restartGame(Scanner sc){
        System.out.println("Do you wanna play again? (yes/no): ");
        return sc.nextLine().equalsIgnoreCase("yes");
    }
}
