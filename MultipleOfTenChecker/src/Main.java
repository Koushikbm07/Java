import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n,int d) {
		 if(n%d==0) {
			 System.out.println(" The number is a multiple of "+d);
			 return;
		 }
		 System.out.println("The number is not a multiple of "+d);

	 }
	 

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a Number");
		 int d=scan.nextInt();//d=10
		 System.out.println("Enter the Number to Check multiple of "+d);
		 int n = scan.nextInt();
		 checkMultipleOfTen(n,d);
	}

}
