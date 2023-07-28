import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks");
		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();
		checkGrade(marks);

	}
	static void checkGrade(int marks) {
		if(marks>45){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
}
