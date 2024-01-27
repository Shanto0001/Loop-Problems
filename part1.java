//count the number of digits for a given number n

import java.util.*;

/**
 * part1
 */
public class part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER ");
        int n = sc.nextInt();
        int original_n = n;
        int numberofdigits = 0;
        while (n > 0) {
            n = n / 10;
            numberofdigits++;

        }
        System.out.println("Number of digits in " + original_n + " = " + numberofdigits);

    }
}