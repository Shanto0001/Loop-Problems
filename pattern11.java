import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = r; i >= 1; i--) {
            for (int j = r; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
