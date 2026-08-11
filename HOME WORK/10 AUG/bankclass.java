import java.util.Scanner;
class BA {
    int accNum;
    String name;
    String type;
    double b;
    void details(int a, String n, String t, double bal) {
        accNum = a;
        name = n;
        type = t;
        b = bal;
    }
    void deposit(double amt) {
        b += amt;
        System.out.println("Deposited ₹" + amt + " to Acc " + accNum);
    }
    void withdraw(double amt) {
        if (b >= amt) {
            b -= amt;
            System.out.println("Withdrew ₹" + amt + " from Acc " + accNum);
        } else {
            System.out.println("Insufficient balance in Acc " + accNum);
        }
    }
    void transfer(BA target, double amt) {
        if (b >= amt) {
            b -= amt;
            target.b += amt;
            System.out.println("Transferred ₹" + amt + " from Acc " + accNum + " to Acc " + target.accNum);
        } else {
            System.out.println("Transfer failed: Insufficient balance in Acc " + accNum);
        }
    }
    void display() {
        System.out.println("Acc No: " + accNum + " | Name: " + name + " | Type: " + type + " | Balance: ₹" + b);
    }
}
public class Main {
    public static void main(String[] args) {
        BA[] accs = new BA[3];

        for (int i = 0; i < 3; i++) {
            accs[i] = new BA();
        }
        accs[0].details(101, "Alice", "Savings", 0);
        accs[1].details(102, "Bob", "Current", 0);
        accs[2].details(103, "Charlie", "Savings", 1000);
        System.out.println("TRANSACTIONS");
        accs[0].deposit(10000);
        accs[1].deposit(5000);
        accs[0].transfer(accs[1], 3000);
        accs[1].withdraw(2000);
        System.out.println("FINAL BALANCES");
        for (int i = 0; i < accs.length; i++) {
            accs[i].display();
        }
    }
}
