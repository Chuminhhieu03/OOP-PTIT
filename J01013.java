import java.util.*;

public class Main {

    public static final int N = (int) 2e6;
    public static int[] prime = new int[N + 5];

    public static void init() {
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i] == 0) {
                for (int j = i * i; j <= N; j += i) {
                    if (prime[j] == 0) prime[j] = i;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (prime[i] == 0) prime[i] = i;
        }
    }
    public static int handle(int n){
        if (prime[n] == 0) {
            return n;
        }
        int sum = 0;
        while (n != 1) {
            sum += prime[n];
            n /= prime[n];
        }
        return sum;
    }
    public static void main (String[]args){
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            sum += handle(n);
        }
        System.out.println(sum);
    }
}
