import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact*=i;

		}

		System.out.println("factorial of number"+n+" is " +fact);

		

		
	}

}
