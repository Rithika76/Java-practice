import java.util.Scanner;
class Item {
    int id;
    String name;
    double p;
    int q;
    void details(int i, String n, double price, int qty) {
        id = i;
        name = n;
        p = price;
        q = qty;
    }
    double getTot() {
        return p * q;
    }
    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Price: ₹" + p + " | Qty: " + q + " | Tot: ₹" + getTot());
    }
}

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
        }
        items[0].details(1, "Laptop", 50000, 1);
        items[1].details(2, "Mouse", 500, 3);
        items[2].details(3, "Keyboard", 1500, 2);
        items[3].details(4, "Monitor", 12000, 1);
        items[4].details(5, "USB Cable", 200, 5);
        System.out.println("ITEM DETAILS");
        for (int i = 0; i < 5; i++) {
            items[i].display();
        }
        double sub = 0;
        int totQ = 0;
        Item maxP = items[0];
        Item minP = items[0];
        Item maxQ = items[0];
        for (int i = 0; i < 5; i++) {
            sub += items[i].getTot();
            totQ += items[i].q;
            if (items[i].p > maxP.p) maxP = items[i];
            if (items[i].p < minP.p) minP = items[i];
            if (items[i].q > maxQ.q) maxQ = items[i];
        }
        double dr = 10;
        double da = sub * (dr / 100);
        double dsub = sub - da;
        double gr = 18;
        double ga = dsub * (gr / 100);
        double fb = dsub + ga;
        System.out.println("\nBILL SUMMARY");
        System.out.println("Subtotal: ₹" + sub);
        System.out.println("Discount (" + dr + "%): -₹" + da);
        System.out.println("GST (" + gr + "%): +₹" + ga);
        System.out.println("Final Bill Amount: ₹" + fb);
        System.out.println("\nSTATS");
        System.out.println("Most Expensive: " + maxP.name + " (₹" + maxP.p + ")");
        System.out.println("Cheapest: " + minP.name + " (₹" + minP.p + ")");
        System.out.println("Highest Qty Purchased: " + maxQ.name + " (" + maxQ.q + " units)");
        System.out.println("Total Items Purchased: " + totQ);
    }
}
