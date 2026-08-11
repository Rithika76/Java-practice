import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = sc.nextInt();
        }
        int l = 0;
        for (int r = 1; r < 8; r += 2) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;

            // Print the array state after each swap
            for (int i = 0; i < 8; i++) {
                System.out.print(a[i] + (i == 7 ? "" : " "));
            }
            System.out.println();
        }
    }
}
