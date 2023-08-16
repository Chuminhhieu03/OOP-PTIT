import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long n ;
        while(t-- >0) {
            n = scanner.nextLong();
            System.out.println(n*(n+1)/2);
        }
    }
}
