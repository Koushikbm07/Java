import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
		Scanner scan= new Scanner(System.in);
		int age=scan.nextInt();
		categorizeAge(age);

	}
	public static void categorizeAge(int age) {
		if (age >= 1 && age <= 12) { System.out.println("Child"); 
		}
		else if (age >= 13 && age <= 19) { 
			System.out.println("Teen"); 
		} 
		else if (age >= 20 && age <= 59) { 
			System.out.println("Adult"); 
		} 
		else if (age >= 60) {
			System.out.println("Senior");
		} 
		else { 
			System.out.println("Invalid");
		}
	}

			

}
