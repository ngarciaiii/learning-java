package week2;

import java.util.Scanner;

public class week2_ex32_35{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//EXERCISE 32
		int sum = 0;
		int i = 0;

		System.out.print("Until what? ");
		int num = Integer.parseInt(reader.nextLine());
		
		while (i <= num) {
			sum += i;
			i++;
		} System.out.println("Sum is: " + sum);
		
		
		
		
		//EXERCISE 33
		System.out.println();
		
		System.out.print("First number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Second number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		System.out.println("The sum is " + (num1 + num2));
		
		
		//EXERCISE 34
		System.out.println();
		
		System.out.print("Type a number: ");
		int n = Integer.parseInt(reader.nextLine());
		
		int count = 0;
		int product = 1;
		
		while (count <= n) {
			product *= count;
			count++;
		} System.out.println(product);
		
	}
}