
import java.util.Scanner;

public class SumOfThree{
	public static void main(String[] args){

		Scanner reader = new Scanner(System.in);

		//EXERCISE 25

//		int sum = 0;
//		int read;
//
//		System.out.print("Type the first number: ");
//		read = Integer.parseInt(reader.nextLine());
//
//		System.out.print("Type the second number: ");
//		read = Integer.parseInt(reader.nextLine()) + read;
//
//		System.out.print("Type the third number: ");
//		sum = Integer.parseInt(reader.nextLine()) + read;
//
//		System.out.println();
//		System.out.println("Sum: " + sum);

		//EXERCISE 26

		int sum1 = 0;

		while (true) {
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
