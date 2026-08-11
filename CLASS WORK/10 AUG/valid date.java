import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        int mth = sc.nextInt();
        int day = sc.nextInt();
        if (yr >= 1000 && yr <= 9999) {
            if (mth >= 1 && mth <= 12) {
                int max;
                if (mth == 2) {
                    if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
                        max = 29;
                    } else {
                        max = 28;
                    }
                } else if (mth == 4 || mth == 6 || mth == 9 || mth == 11) {
                    max = 30;
                } else {
                    max = 31;
                }
                if (day >= 1 && day <= max) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
