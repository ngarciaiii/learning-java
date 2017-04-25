package usingScanner;

import java.util.Scanner;

public class exercise_7 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(reader.nextLine());	
		
		int addAns = num1 + num2;
		
		double divAns = (double) num1 / num2;  //important to convert int into float by using (double)!!
		
		System.out.println("Sum of the numbers: " + addAns);
		System.out.println("Division: " + divAns + System.lineSeparator());
		
		System.out.print("Type the radius: ");
		double radius = Integer.parseInt(reader.nextLine());
		
		double circumference = 2 * Math.PI * radius;
		
		System.out.println("Circumference of the circle: " + circumference + System.lineSeparator());
		
		
		System.out.print("Type a number: ");
		int a = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type another number: ");
		int b = Integer.parseInt(reader.nextLine());
		
		if (a > b) {
			System.out.println("The bigger number of the two numbers given was: " + a + System.lineSeparator());
		} else {
			System.out.println("The bigger number of the two numbers given was: " + b + System.lineSeparator());				
		}
		
		System.out.print("Type your name: ");
		String name = reader.nextLine();
		
		System.out.print("Type your age: ");
		int age = Integer.parseInt(reader.nextLine());
		
		System.out.println(System.lineSeparator() + "Type your name: " + name);
		System.out.println("Type your age: " + age);
		
		
	}
}