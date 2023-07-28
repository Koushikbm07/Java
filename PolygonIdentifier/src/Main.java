import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number Of Sides To Identify the Shape");
		int sides=scan.nextInt();
		scan.close();
		identifyPolygon(sides);

	}
	public static void identifyPolygon(int sides)
	{

		switch(sides)
		{
		case 3: System.out.println("Triangle");
			break;
		case 4: System.out.println("Quadrilateral");
			break;
		case 5: System.out.println("Pentagon");
			break;
		case 6: System.out.println("Hexagon");
			break; // Add more cases as needed
		default: System.out.println("Polygon");
			break;

		}

	}


}
