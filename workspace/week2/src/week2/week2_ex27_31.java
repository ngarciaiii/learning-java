package week2;

import java.util.Scanner;

public class week2_ex27_31{
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		//EXERCISE 27		
		int toHundred = 1;
		
		while (toHundred <= 100) {
			System.out.println(toHundred);
			toHundred++;
		}
	
		
		//EXERCISE 28
		System.out.println();
		int fromHundred = 100;
		
		while (fromHundred > 0) {
			System.out.println(fromHundred);
			fromHundred--;
		}
		
		//EXERCISE 29
		System.out.println();
		int toHundredEven = 1;
		
		while (toHundredEven < 101) {
			toHundredEven++;
			if (toHundredEven % 2 == 0) {
				System.out.println(toHundredEven);
			} 
		}
		
		//EXERCISE 30
		System.out.println();
		
		System.out.print("Enter the max number: ");
		int maxNum = Integer.parseInt(reader.nextLine());
		
		int num = 1;
		while (num <= maxNum) {
			System.out.println(num);
			num++;
		}
		
		//EXCERISE 31
		System.out.println();
		
		System.out.print("Enter the first number: ");
		int firstNum = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter the second number: ");
		int secondNum = Integer.parseInt(reader.nextLine());
		
		while (firstNum <= secondNum) {
			System.out.println(firstNum);
			firstNum++;
		}
	}	
}