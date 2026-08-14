import java.util.*;
class ACC{
	int AccountNo;
	String AccountHolder;
	long phoneNo;
	String AccountType;
	double balance;
	ACC(int AccountNo,String AccountHolder,long phoneNo,String AccountType,double balance ){
		this.AccountNo=AccountNo;
		this.AccountHolder=AccountHolder;
		this.phoneNo=phoneNo;
		this.AccountType=AccountType;
		this.balance=balance;
	}
	void display() {
		System.out.println("CUSTOMER ACCOUNT DETAILS");
		System.out.println("Account Number:"+AccountNo);
		System.out.println("Account Holder Name:"+AccountHolder);
		System.out.println("Mobile Number:"+phoneNo);
		System.out.println("Account Type:"+AccountType);
		System.out.println("Balance Amount:"+balance);
	}
}
public class abcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer 1:");
		System.out.println("Enter acc.no:");
		int acc1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		String name1 = sc.nextLine();
		System.out.println("Enter Number:");
		long phone1=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter type:");
		String type1=sc.nextLine();
		System.out.println("Enter balance:");
		double b1=sc.nextDouble();
		System.out.println("Customer 2:");
		System.out.println("Enter acc.no:");
		int acc2=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		String name2 = sc.nextLine();
		System.out.println("Enter Number:");
		long phone2=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter type:");
		String type2=sc.nextLine();
		System.out.println("Enter balance:");
		double b2=sc.nextDouble();
		ACC cus1= new ACC(acc1,name1,phone1,type1,b1);
		ACC cus2 = new ACC(acc2,name2,phone2,type2,b2);
		System.out.println("/nCustomer 1 Details:");
		cus1.display();
		System.out.println("/nCustomer 2 Details:");
		cus2.display();
	}

}
