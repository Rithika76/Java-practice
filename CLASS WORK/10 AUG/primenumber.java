import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            int i = 2;
            boolean isPrime = true;

            while (i * i <= n && isPrime) {
                if (n % i == 0) {
                    isPrime = false;
                }
                i++;
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
