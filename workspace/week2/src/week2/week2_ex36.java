package week2;

import java.util.Scanner;

public class week2_ex36 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//EXERCISE 26
		
		System.out.println("(Enter a number below 0 to end)");
		System.out.print("Enter a number: ");
		int i = 0;
		int sum = 0;
		int num;
		double average = 0;
		int oddNum = 0;
		int evenNum = 0;
		
		while (true) {
			num = Integer.parseInt(reader.nextLine());
			if (num < 0) {
				System.out.println("Thank you and see you later!");
				num = 0;
				break;
			} else {
				i++;
				sum += num;
				if (num % 2 != 0) {
					oddNum++;
				} else {
					evenNum++;
				}
			}
		 }
		average = ((1.0*sum)/i);
		
		System.out.println("The sum is " + sum);
		System.out.println("How many numbers entered: " + i);
		System.out.println("Average: " + sum + " / " + i + " = " + average);
		System.out.println("Odd numbers: " + oddNum);
		System.out.println("Even numbers: " + evenNum);
	}
}