import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isHit = false;
        int licznik = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Pick a number");
            int user_number = scan.nextInt();

            Random number = new Random();
            int number_drawn = number.nextInt(1);
            System.out.println(number_drawn);

            if (user_number == number_drawn) {
                System.out.println("Hit!");
                isHit = true;
            } else {
                System.out.println("Miss!");
            }
            licznik = licznik + 1;
        }
        while (isHit == false && licznik < 5);
        if (licznik >= 5){
            System.out.println("The end");
        }
    }
}


