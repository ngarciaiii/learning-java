package usingScanner;

import java.util.Scanner;

public class readingInt {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Your name: ");
		String name = reader.nextLine();
		
		System.out.print("How old are you: ");
		int age = Integer.parseInt(reader.nextLine());
		
		System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you.");	
	}		
}

// I ended strings like "your name?" and or "how old are you?", then int age = integer.parseInt(reader.nextLine()) isn't recognized. 
// I changed from ? to : and it worked. Hmm? 