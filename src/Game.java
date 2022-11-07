import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void gameUser() {
        Random randon = new Random();
        int numberToGuess = randon.nextInt(100);
        Scanner scanner = new Scanner(System.in);

        boolean canUserTry = true;

        do {
            System.out.println("Give a number");
            int userNumber = scanner.nextInt();

            if (userNumber > numberToGuess) {
                System.out.println("Number is too big");
            } else if (userNumber < numberToGuess) {
                System.out.println("Number is to small");
            } else {System.out.println("Win");
                canUserTry = false;}
        } while (canUserTry == true);

       /* while (canUserTry) {
            System.out.println("Give a numeber");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess) {
                System.out.println("Number is too small");
            } else if (userNumber > numberToGuess) {
                System.out.println("Number is too big");
            } else {
                System.out.println("Bravo");
                canUserTry = false;
            }
        }*/

    }
}
