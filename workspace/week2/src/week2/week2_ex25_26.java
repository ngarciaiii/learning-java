package week2;

import java.util.Scanner;

public class week2_ex25_26{
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		//EXERCISE 25
		
		int sum = 0;
		int read;
		
		System.out.print("Type the first number: ");
		read = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type the second number: ");
		read = Integer.parseInt(reader.nextLine()) + read;
		
		System.out.print("Type the third number: ");
		read = Integer.parseInt(reader.nextLine()) + read;
		
		System.out.println();		
		System.out.println("Sum: " + read);
		
		//EXERCISE 26
		
		System.out.println();
		
		int sum1 = 0; 
	
		System.out.print("(Enter 0 to end)");
		System.out.println();
		System.out.print("Enter number to add: "); 
		
		while(true) {
			int read1 = Integer.parseInt(reader.nextLine());
			if (read1 == 0) {
				break;
			} else {
				sum1 = sum1 + read1;
				System.out.println("Sum now: " + sum1);
			}
		} System.out.println("Sum in the end: " + sum1);
	}
}