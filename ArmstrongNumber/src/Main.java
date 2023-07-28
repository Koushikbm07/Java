import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find Armstrong or not");
		int n=scan.nextInt();
		scan.close();
		Armstrong armstrong = new Armstrong();
		int res=armstrong.getArmstrong(n);
		
		if(res==n)
			System.out.println("The Entered number is ARMSTRONG");
		else
			System.out.println("The Entered number is Not ARMSTRONG");
	}

}
