package String;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		Scanner in = new Scanner(System.in);
		main:
		while(true) {
			System.out.print("Enter String:");
			str = in.nextLine();
			if(str.length() < 5) {
				System.out.println("Error !! Atleast 5 character is required.");
				continue;
			}
			for(int i = 0; i < str.length();i++) {
				char c = str.charAt(i);
				if (!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
					System.out.println("Error !! Special characters or digit found.");
					continue main;
				}
			}
			break;
		}
	}

}
