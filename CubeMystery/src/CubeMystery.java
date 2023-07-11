import java.util.Scanner;

public class CubeMystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(cubeNumber(num));
	}
	static int cubeNumber(int num) {
		return num*num*num;
	}

}
