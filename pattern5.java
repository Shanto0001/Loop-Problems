import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
