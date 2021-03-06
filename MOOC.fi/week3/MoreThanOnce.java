
import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce{

	public static boolean moreThanOnce(ArrayList<Integer> list, int searched){
		int total = 0;
		for (int number : list) {
			if (number == searched) {
				total++;
			}
		}

		if (total <= 1){
			return false;
		} return true;
	}

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }

	}
}
