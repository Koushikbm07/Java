import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Character");
		char ch = scan.next().charAt(0);
		MessageDecoder messageDecoder = new MessageDecoder();
		System.out.println(messageDecoder.decodeCharacter(ch));
		
	}

}
