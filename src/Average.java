import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void numberAverage() {
        int [] numbers = new int [5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Pick a 5 numbers");
            int user_number = scan.nextInt();
            numbers[i]=user_number;

        }
        Arrays.stream(numbers).average().orElse(Double.NaN);
        System.out.println(Arrays.stream(numbers).average().orElse(Double.NaN));

    }
}
