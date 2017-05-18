package week2;

import java.util.Scanner;

public class week2_ex39_40{
	
	private static void printStars(int amount) {
		int i = 0;
		while(i < amount) {
			System.out.print("*");                          
			i++;
		} System.out.println();
	}
	
	public static void printSquare(int sideSize){
		int i = 0;
		while (i < sideSize) {
			printStars(sideSize);
			i++;
		} System.out.println();
	}
	
	public static void printRectangle(int width, int height) {
		int i = 0;
		while (i < height) {
			printStars(width);
			i++;
		} System.out.println();
	}
	
//	public static void printTriangle(int size) {
//		int i = 0;
//		while (i <= size) {
//			printStars(i);
//			i++;
//		}
//	}
	
	public static void printWhitespace(int size){
		int i = 0;
		while(i < size) {
			System.out.print(" ");
			i++;
		}
	}
	
	public static void printTriangle(int size) {
		int i = 1;
		while(i <= size) {
			printWhitespace(size - i);
			printStars(i);
			i++;
		}
	}
	
	public static void xmasTree(int height) {
		int i = 1;
		while (i <= height) {
			printWhitespace(height - i);
			printStars(2 * i - 1);
			i++;
		}
		
		i = 2;		
		while (--i >= 0) {
	        printWhitespace(height - 2);
	        printStars(3);
	    }
	}
	
	public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
	}
}