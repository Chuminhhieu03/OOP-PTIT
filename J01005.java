import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            double n = scanner.nextDouble(), h = scanner.nextDouble();
            for(int i = 1 ; i < n; i++){
                System.out.printf("%6f ", h*Math.sqrt(i/n));
            }
            System.out.println();
        }
    }
}
