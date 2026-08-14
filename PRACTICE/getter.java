import java.util.Scanner;
class sec {

    private int AccountNo;
    private String AccountHolder;
    private long phoneNo;
    private String AccountType;
    private double balance;

    sec(int AccountNo, String AccountHolder, long phoneNo,
        String AccountType, double balance) {

        this.AccountNo = AccountNo;
        this.AccountHolder = AccountHolder;
        this.phoneNo = phoneNo;
        this.AccountType = AccountType;
        this.balance = balance;
    }

    int getAccountNo() {
        return this.AccountNo;
    }
    String getAccountHolder() {
        return this.AccountHolder;
    }
    long getPhoneNo() {
        return this.phoneNo;
    }
    String getAccountType() {
        return this.AccountType;
    }
    double getBalance() {
        return this.balance;
    }
    void display() {
        System.out.println("CUSTOMER ACCOUNT DETAILS");
        System.out.println("Account Number: " + this.getAccountNo());
        System.out.println("Account Holder Name: "+ this.getAccountHolder());
        System.out.println("Mobile Number: "+ this.getPhoneNo());
        System.out.println("Account Type: "+ this.getAccountType());
        System.out.println("Balance Amount: "+ this.getBalance());
    }
}

public class datasec {

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
        sec cus1 = new sec(acc1, name1, phone1, type1, b1);
        sec cus2 = new sec(acc2, name2, phone2, type2, b2);
        System.out.println("\nCustomer 1 Details:");
        cus1.display();
        System.out.println("\nCustomer 2 Details:");
        cus2.display();

	}

}
