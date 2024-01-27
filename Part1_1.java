//find the sum of digits in a given number in n 

import java.util.Scanner;

public class Part1_1 {
    public static void main(String[] args) {
        System.out.println("ENTER NUMBER TO SUM");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigits = 0;
        int original_n = n;

        while (n > 0) {
            sumofdigits += n % 10;
            n = n / 10;
        }
        System.out.println("number of digits of => " + original_n + " = " + sumofdigits);
    }
}
