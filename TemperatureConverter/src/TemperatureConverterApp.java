import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temp in F");
		double f=scan.nextDouble();
		scan.close();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
	}

}
