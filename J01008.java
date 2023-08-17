import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            long n = sc.nextLong();
            System.out.print("Test " + i + ": ");

            for (int j = 2; j <= Math.sqrt(n); j++) {
                int cnt = 0;
                while (n % j == 0) {
                    cnt++;
                    n /= j;
                }
                if (cnt > 0) {
                    System.out.printf("%d(%d) ", j, cnt);
                }
            }

            if (n > 1) {
                System.out.printf("%d(%d) ", n, 1);
            }

            System.out.println();
        }
    }
}
