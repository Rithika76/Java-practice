class asd {
	String bankname="MARIAMMAN INDIAN BANK";
    private int AccountNo;
    private String AccountHolder;
    private long phoneNo;
    private String AccountType;
    private double balance;
    asd(int AccountNo, String AccountHolder, long phoneNo, String AccountType, double balance) {
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
    long getphoneNo() {
        return this.phoneNo;
    }
    void display() {
    	System.out.println("====================================");
        System.out.println("   " + bankname);
        System.out.println("====================================");
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
public class operation {

	public static void main(String[] args) {
		 asd account1 = new asd( 1001, "Arun", 9876543210L, "Savings", 25000);
		 System.out.println("\n******** ACCOUNT 1 ********");
		 account1.display();
		 account1.deposit(5000);
		 System.out.println("Updated Balance: Rs." + account1.getBalance());
		 account1.withdraw(3000);
		 System.out.println("Updated Balance: Rs." + account1.getBalance());
	     account1.setphoneNo(9999999999L);
	     System.out.println("Updated Mobile Number: "+ account1.getphoneNo());
	     account1.deposit(-1000);
	     account1.withdraw(-2000);
	     account1.withdraw(50000);
		 asd account2 = new asd(1002, "Kumar", 9876501234L, "Current", 50000);
		 System.out.println("\n******** ACCOUNT 2 ********");
		 account2.deposit(10000);
		 account2.display();
		 account2.withdraw(5000);
		 account2.display();		
	}

}
