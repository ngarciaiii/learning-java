package usingScanner;

import java.util.Scanner;

public class greeting {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Who is greeted?");
		String name = reader.nextLine();
		
		System.out.println("Hi " + name);
		System.out.print("Hi " + name);
		System.out.print("Hi " + name);
	}
}	
