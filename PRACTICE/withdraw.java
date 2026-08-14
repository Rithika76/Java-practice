import java.util.Scanner;
class edc {
    private int AccountNo;
    private String AccountHolder;
    private long phoneNo;
    private String AccountType;
    private double balance;
    edc(int AccountNo, String AccountHolder, long phoneNo, String AccountType, double balance) {
        this.AccountNo = AccountNo;
        this.AccountHolder = AccountHolder;
        this.phoneNo = phoneNo;
        this.AccountType = AccountType;
        this.balance = balance;
    }
    int getAccountNumber() {
        return this.AccountNo;
    }
    String getAccountHolderName() {
        return this.AccountHolder;
    }
    String getAccountType() {
        return this.AccountType;
    }
    double getBalance() {
        return this.balance;
    }
    void setphoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    void display() {
        System.out.println("CUSTOMER ACCOUNT DETAILS");
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Account Holder Name: " + this.getAccountHolderName());
        System.out.println("Mobile Number: " + this.phoneNo);
        System.out.println("Account Type: " + this.getAccountType());
        System.out.println("Balance Amount: " + this.getBalance());
    }
    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } 
        else {
            this.balance = this.balance + amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("New Balance: Rs." + this.getBalance());
        }
    }
    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            this.balance = this.balance - amount;

            System.out.println("Amount withdrawn successfully.");
            System.out.println("New Balance: Rs." + this.getBalance());
        }
    }
}
public class withdraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Customer 1:");
        System.out.println("Enter acc.no:");
        int acc1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String name1 = sc.nextLine();
        System.out.println("Enter Number:");
        long phone1 = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter type:");
        String type1 = sc.nextLine();
        System.out.println("Enter balance:");
        double b1 = sc.nextDouble();
        System.out.println("\nCustomer 2:");
        System.out.println("Enter acc.no:");
        int acc2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String name2 = sc.nextLine();
        System.out.println("Enter Number:");
        long phone2 = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter type:");
        String type2 = sc.nextLine();
        System.out.println("Enter balance:");
        double b2 = sc.nextDouble();
        edc cus1 = new edc(acc1, name1, phone1, type1, b1);
        edc cus2 = new edc(acc2, name2, phone2, type2, b2);
        System.out.println("\nCustomer 1 Details:");
        cus1.display();
        System.out.println("\nCustomer 2 Details:");
        cus2.display();
        System.out.println("\nEnter deposit amount for Customer 1:");
        double amount = sc.nextDouble();
        cus1.deposit(amount);
        System.out.println("\nEnter withdrawal amount for Customer 1:");
        double withdrawAmount = sc.nextDouble();
        cus1.withdraw(withdrawAmount);


	}

}
