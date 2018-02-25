import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int numberDrawn = drawNumber();
		int guess = 0;
		int guesses = 0;


		while(guess != numberDrawn){
			System.out.print("Guess a number: ");
			guess = Integer.parseInt(reader.nextLine());
			guesses++;

			if (guess < numberDrawn){
				System.out.println("The number is lesser, guesses made: " + guesses);
			} else if (guess > numberDrawn){
				System.out.println("The number is greater, guesses made: " + guesses);
			} else {
				System.out.println("Congratulations, your guess is correct!");
			}
		}
	}

	private static int drawNumber(){
		return new Random().nextInt(101);
	}
}
