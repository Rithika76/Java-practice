import java.util.*;
class sete {
    private int AccountNo;
    private String AccountHolder;
    private long phoneNo;
    private String AccountType;
    private double balance;

    sete(int AccountNo, String AccountHolder, long phoneNo,
        String AccountType, double balance) {

        this.AccountNo = AccountNo;
        this.AccountHolder = AccountHolder;
        this.phoneNo = phoneNo;
        this.AccountType = AccountType;
        this.balance = balance;
    }

    void setAccountNumber(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    void setAccountHolderName(String AccountHolder) {
        this.AccountHolder = AccountHolder;
    }

    void setMobileNumber(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void display() {

        System.out.println("CUSTOMER ACCOUNT DETAILS");

        System.out.println("Account Number: " + this.setAccountNumber());
        System.out.println("Account Holder Name: " + this.setAccountHolderName());
        System.out.println("Mobile Number: " + this.setMobileNumber());
        System.out.println("Account Type: " + this.setAccountType());
        System.out.println("Balance Amount: " + this.setBalance());
    }
}

public class setter {

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
