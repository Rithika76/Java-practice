package EXCEPTION;
import java.util.*;
class InvalidMarkException extends RuntimeException{
	public InvalidMarkException(String message) {
	     super(message);
	 }
}
class InsufficientMarkException extends RuntimeException{
	public InsufficientMarkException(String message) {
	     super(message);
	 }
}
class ArrayException extends RuntimeException{
	public ArrayException(String message) {
		super(message);
	}
}
public class studentmark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n!=5) {
			throw new ArrayException("Number of Marks Should be 5");
		}
		int[] arr = new int[n];
		for(int i =0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++) {
			if(arr[i]>100) {
					throw new  InvalidMarkException("Mark should be below 100");
				}
			else if(arr[i]<0) {
					throw new InsufficientMarkException("Mark should be above 0");
				}
			else {
					sum += arr[i];
				}
			}
			System.out.println("Average Marks:"+sum/5);
		}
		

	}

