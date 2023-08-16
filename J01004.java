import java.util.Scanner;
public class Main {
    static boolean check(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(),n;
        while(t-- >0){
            n = scanner.nextInt();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
