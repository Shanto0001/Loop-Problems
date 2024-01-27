import java.util.*;

public class part1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofnumber = 0;
        int num = 1;

        while (num <= n) {
            sumofnumber = sumofnumber + num;
            num++;
        }
        System.out.println(sumofnumber);
    }

}