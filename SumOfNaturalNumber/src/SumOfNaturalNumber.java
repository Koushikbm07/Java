import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int sum=0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
			
		}			
		System.out.println("The sum of "+n +" Natural number is "+sum);
	}

}
