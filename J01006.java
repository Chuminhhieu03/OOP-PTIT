import java.util.Scanner;

public class Main {
    static long[] fb = new long[93];

    static void init() {
        fb[1] = 1;
        fb[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fb[i] = fb[i - 1] + fb[i - 2];
        }
    }

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(fb[n]);
        }
    }
}
