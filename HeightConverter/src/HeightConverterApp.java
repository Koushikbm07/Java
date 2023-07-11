import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double inches = scan.nextDouble();
		HeightConverter converter = new HeightConverter();

		System.out.printf("%.2f",converter.convertInchesToFeet(inches));
	}

}
