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
		
		System.out.print("First: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Last: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		int sum1 = 0;
		
        while (num1 <= num2) {
            sum1 += num1;
            num1++;

            System.out.println(num1);
        }
		
		System.out.println("The sum is " + (sum1));
		
		
		
		//EXERCISE 34
		System.out.println();
		
		System.out.print("Type a number: ");
		int n = Integer.parseInt(reader.nextLine());
		
		int count = 1;
		int product = 1;
		
		while (count <= n) {
			product *= count;
			count++;
		} System.out.println(product);
		
		
		
		//EXERCISE 35
		System.out.println();
		
		System.out.print("Type a power number: ");
		int power = Integer.parseInt(reader.nextLine());
		
		int result = (int)Math.pow(2, power);
		System.out.println("The result is " + result);
		
	}
}