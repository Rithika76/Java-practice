class InsufficientBalanceException extends Exception {
	 public InsufficientBalanceException(String message) {
	     super(message);
	 }
	}
	class BankAccount {
	 private double balance;

	 public BankAccount(double ibalance) {
	     this.balance = ibalance ;
	 }

	 public double getBalance() {
	     return balance;
	 }
	 public void withdraw(double amount) throws InsufficientBalanceException {
	     if (amount > balance) {
	         throw new InsufficientBalanceException("Insufficient balance. Current balance: $" + balance);
	     }
	     balance -= amount;
	     System.out.println("Remaining balance: $" + balance);
	 }
	}

public class customexc {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(500.00);

	     try {
	         account.withdraw(200.00);
	         account.withdraw(400.00);
	     } catch (InsufficientBalanceException e) {
	         System.err.println("Exception caught: " + e.getMessage());
	     }

	}

}
