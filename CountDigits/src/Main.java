import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			calculateSumOfDigits(n);

			
	}
	static void calculateSumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=digit;
			n=n/10;
		}
		
		System.out.println("Sum of the digit of a number is "+sum);;
	}

}
