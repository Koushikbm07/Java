import java.util.Scanner;

public class HalveItApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		System.out.printf("%.2f",HalveIt.halveTheNumber(num));
	}
	
}
