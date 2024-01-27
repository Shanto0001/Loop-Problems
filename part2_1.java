import java.util.Scanner;

public class part2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumofnumber = 0;
        for (int num = 1; num <= n; num++) {
            sumofnumber = sumofnumber + num;
        }
        System.out.print(sumofnumber);
    }
}
