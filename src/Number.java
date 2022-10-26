import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void tryNumbers(){
        boolean isHit = false;
        int licznik = 0;
        int attemps = 5;

        Random number = new Random();
        int number_drawn = number.nextInt(101); //wybraliśmy numer np 3 - program wybiera
        System.out.println(number_drawn +"number drawn");

        Scanner scan = new Scanner(System.in); //objekt scannera, czyta z konsoli, nie musi być w petli

        do {
            System.out.println("Pick a number");
            int user_number = scan.nextInt();

            if (user_number == number_drawn) {
                System.out.println("Hit!");
                isHit = true;
            } else {
                System.out.println("Miss!");
                System.out.println("Count of attemps "+(attemps-licznik-1));
            }
            licznik = licznik + 1;
        }
        while (isHit == false && licznik < attemps);
        if (licznik >= attemps){
            System.out.println("The end");
        }
    }
}

