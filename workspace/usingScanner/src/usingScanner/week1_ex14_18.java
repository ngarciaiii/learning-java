package usingScanner;

import java.util.Scanner;

public class week1_ex14_18 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//EXERCISE 14-16
		System.out.print("Type a number: ");
		int pos_neg = Integer.parseInt(reader.nextLine());
		
		if (pos_neg > 0) {
			System.out.println("The number is positive.");
		} else {
			System.out.println("The number is not positive.");
		}
	
		System.out.println();
		
		System.out.print("How old are you?: ");
		int age = Integer.parseInt(reader.nextLine());
		
		if (age < 18) {
			System.out.println("You haven't reached the age of maturity yet!");
		} else {
			System.out.println("You have reached the age of maturity!");
		}
		
		System.out.println();
		
		System.out.print("Type a number: ");
		int even_odd = Integer.parseInt(reader.nextLine());
		
		if (even_odd % 2 == 0) {
			System.out.println("The number is even.");
		} else {
			System.out.println("The number is odd.");
		}
		
		System.out.println();
		
		//EXERCISE 17-18
		
		System.out.print("Type the first number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type the second number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		if (num1 == num2) {
			System.out.println("The numbers are equal!");
		} else if (num1 > num2) {
			System.out.println("Greater number: " + num1);
		} else {
			System.out.println("Greater number: " + num2);
		}
	
		System.out.println();
		
		System.out.print("Type the points: ");
		int grade = Integer.parseInt(reader.nextLine());
		
		if (grade > 49) {
			System.out.println("Grade: 5");
		} else if (grade < 50 && grade > 44) {
			System.out.println("Grade: 4");
		} else if (grade < 45 && grade > 39) {
			System.out.println("Grade: 3");
		} else if (grade < 40 && grade > 34) {
			System.out.println("Grade: 2");
		} else if (grade< 35 && grade > 29) {
			System.out.println("Grade: 1");
		} else {
			System.out.println("Grade: failed");
		}
			 
	} 
}