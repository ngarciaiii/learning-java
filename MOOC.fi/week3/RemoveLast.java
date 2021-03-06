

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveLast{
	public static void removeLast(ArrayList<String> list) {
		int i = -1;
		for (String item : list) {
			i++;
		}

		list.remove(i);
	}

	public static void main(String[] args) {
		ArrayList<String> persons = new ArrayList<String>();
		persons.add("Pekka");
		persons.add("James");
		persons.add("Liz");
		persons.add("Brian");

		System.out.println("Persons:");
		System.out.println(persons);

		Collections.sort(persons);
		removeLast(persons);

		System.out.println(persons);
	}
}
