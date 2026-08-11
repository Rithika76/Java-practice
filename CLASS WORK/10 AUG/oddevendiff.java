import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = 1;
        while (pos * 10 <= num) {
            pos *= 10;
        }
        int odd = 0;
        int even = 0;
        int idx = 1;
        while (pos > 0) {
            int digit = (num / pos) % 10;
            if (idx % 2 != 0) {
                odd = odd * 10 + digit;
            } else {
                even = even * 10 + digit;
            }
            pos /= 10;
            idx++;
        }
        System.out.println(Math.abs(odd - even));
    }
}
