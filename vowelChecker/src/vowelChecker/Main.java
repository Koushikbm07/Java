package vowelChecker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character to check vowel or not");
		char ch = scan.next().charAt(0);
		scan.close();
		identifyCharacter(ch);
		
	}

	 public static void identifyCharacter(char ch) {
		 if (Character.isDigit(ch)) { 
			 System.out.println("Digit");
			 } 
		 else if (!Character.isLetter(ch)) {
			 System.out.println("Special character"); 
			}
		 else {
			 switch (Character.toLowerCase(ch)) {
			 	case 'a': 
			 	case 'e': 
			 	case 'i':
			 	case 'o': 
			 	case 'u': 
			 		if (Character.isLowerCase(ch)) {
			 			System.out.println(ch+"Is a Lower-case vowel");
			 		}
			 		else {
			 			System.out.println(ch+"Is a Upper-case vowel");
			 		} 
			 		break; 
			 	default:
			 		if (Character.isLowerCase(ch)) {
			 			System.out.println(ch+"Is a Lower-case consonant"); 
			 		} 
			 		else { 
			 			System.out.println(ch+"Is a Upper-case consonant"); 
			 		}
			 		break; 
			 }
			 }
		 }
	 }		 		

