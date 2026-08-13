package EXCEPTION;
import java.util.*;
class InvalidPasswordException extends RuntimeException{
	public InvalidPasswordException(String msg) {
		super(msg);
	}
}
public class password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		String s = sc.nextLine();
		int a = s.length();
		if(a<8) {
			throw new InvalidPasswordException("Password must contain atleast 8 characters");
		}
		else {
			System.out.println("Password Accepted");
		}
	}

}
