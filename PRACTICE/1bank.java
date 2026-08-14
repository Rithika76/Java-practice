import java.util.*;
class account{
	static String bankname ="Mariamma Indian Bank";
	int acc_id;
	account(int acc_id){
		this.acc_id=acc_id;
	}
	void display() {
		System.out.println("Account ID:"+this.acc_id);
		System.out.println("Bank Name:"+bankname);
		System.out.println();
	}
}
public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Account id1:");
		int id1=sc.nextInt();
		System.out.println("Account id2:");
		int id2=sc.nextInt();
		System.out.println("Account id3:");
		int id3=sc.nextInt();
		account acc1=new account(id1);
		account acc2=new account(id2);
		account acc3=new account(id3);
		System.out.println("Account Details:");
		acc1.display();
		acc2.display();
		acc3.display();

	}

}
