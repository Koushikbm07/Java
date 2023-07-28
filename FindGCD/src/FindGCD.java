import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Two Numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		System.out.println(findGCD(m, n));

	}
	static int findGCD(int m,int n) {
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		return m;
	}

}
