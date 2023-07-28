import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to find a series its Series ");
		int n=scan.nextInt();
		scan.close();
		System.out.println(findSumOFSeries(n));
	}
	static double findSumOFSeries(int n) {
		int i=1;
		double sum=0;
		while(i<=n) {
			sum+=1.0/i;
			i++;
		}
		return sum;
	}

}
