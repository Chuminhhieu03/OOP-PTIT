import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        long temp =1 ;
        for(int i = 2 ; i <= n ; i++){
            temp *= i;
            sum += temp;
        }
        System.out.print(sum);
    }
}
