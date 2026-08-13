
import java.util.ArrayList;
import java.util.Scanner;

public class SortAlist {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }

        int le = 0;
        int temp = 0;

        // Start r from index 0 so every element is evaluated
        for (int r = 0; r < n; r++) {
            if (l.get(r) % 2 != 0) {
                temp = l.get(le);
                l.set(le, l.get(r));
                l.set(r, temp);
                le++;
            }
        }

        System.out.println(l);
    }
}
