import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			FinanceCalculator calculator = new FinanceCalculator();
			double principal=scan.nextDouble();
			double rate=scan.nextDouble();
			double time=scan.nextDouble();
			System.out.println(calculator.calculateSimpleInterest(principal,rate,time));
	}

}
