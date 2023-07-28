import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		boolean isPrime=true;
		if(n<2) {
			System.out.println(n+" is not a prime number");
			
		}
		else {
			for (int i = 2; i*i <= n; i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}
		if(isPrime)
			System.out.println(n+ " Its a Prime Number");
		else
			System.out.println(n+" Its not a prime Number");
		
		
	}
}
	//method to find whether N is Prime or not
//	static boolean isPrime(int n) {
//		if(n<2) {
//			System.out.println(n+" is not a prime number");
//		}
//		for (int i = 2; i*i<= n; i++) {
//			if(n%i==0) {
//				return false;
//				
//			}
//		}
//		return true;
//	}


