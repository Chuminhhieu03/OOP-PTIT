import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cv = (a+b)*2;
        int dt = a*b;
        if(a<=0 || b<=0){
            System.out.println("0");
        }
        else {
            System.out.println(cv + " " + dt);
        }
    }
}
