import java.util.*;
abstract class Acc {
    private int accNum;
    private String name;
    private double bal;
    Acc() {
        accNum = 0;
        name = "Unknown";
        bal = 0;
    }
    Acc(int accNum, String name) {
        this.accNum = accNum;
        this.name = name;
        this.bal = 0;
    }
    Acc(int accNum, String name, double bal) {
        this.accNum = accNum;
        this.name = name;
        this.bal = bal;
    }
    public int getAccNum() {
        return accNum;
    }
    public String getName() {
        return name;
    }
    public double getBal() {
        return bal;
    }
    protected void setBal(double bal) {
        this.bal = bal;
    }
    public void dep(double amt) {
        if (amt > 0) {
            bal = bal + amt;
            System.out.println(amt + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public abstract void draw(double amt);
    public void disp() {
        System.out.println("-----------------------------");
        System.out.println("Account Number : " + accNum);
        System.out.println("Holder Name    : " + name);
        System.out.println("Balance        : " + bal);
    }
}
class SavAcc extends Acc {
    SavAcc() {
        super();
    }
    SavAcc(int accNum, String name) {
        super(accNum, name);
    }
    SavAcc(int accNum, String name, double bal) {
        super(accNum, name, bal);
    }
    @Override
    public void draw(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBal() - amt >= 1000) {
            setBal(getBal() - amt);
            System.out.println(amt + " withdrawn from Savings Account.");
        } else {
            System.out.println("Withdrawal rejected.");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
    }
}
class CurAcc extends Acc {
    CurAcc() {
        super();
    }
    CurAcc(int accNum, String name) {
        super(accNum, name);
    }
    CurAcc(int accNum, String name, double bal) {
        super(accNum, name, bal);
    }
    @Override
    public void draw(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBal() - amt >= -5000) {
            setBal(getBal() - amt);
            System.out.println(amt + " withdrawn from Current Account.");
        } else {
            System.out.println("Withdrawal rejected.");
            System.out.println("Overdraft limit of ₹5000 exceeded.");
        }
    }
}
public class Banking {
    public static void main(String[] args) {
        SavAcc s1 = new SavAcc(101, "Abitha", 10000);
        SavAcc s2 = new SavAcc(102, "Priya");
        CurAcc c1 = new CurAcc(201, "Rahul", 3000);
        s1.disp();
        s2.disp();
        c1.disp();
        s1.dep(2000);
        s1.draw(5000);
        s1.draw(6000);
        s1.disp();
        c1.dep(1000);
        c1.draw(7000);
        c1.draw(3000);
        c1.disp();
        Acc a;
        a = s1;
        System.out.println("\nBankAccount reference -> SavingsAccount");
        a.draw(1000);
        a.disp();
        a = c1;
        System.out.println("\nBankAccount reference -> CurrentAccount");
        a.draw(2000);
        a.disp();
    }
}
