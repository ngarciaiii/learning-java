package week2;

import java.util.Scanner;

public class week2_ex40_ghSolution {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount > 0) {
            System.out.print("*");                          
            amount--;
        } System.out.println();
    }

    public static void printWhitespaces(int amount) {
        while(amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        int whitespaces = size - 1; 
        while(whitespaces >= 0) {
            printWhitespaces(whitespaces);
            printStars(size - whitespaces);
            whitespaces--;
        }
    }

    public static void xmasTree(int height) {
 	int width = 1;
        int i = height;
        while (i > 0) {
            int whitespaces = (height * 2 - width) / 2;
            printWhitespaces(whitespaces);
            printStars(width);
            i--;
            width += 2;
        }

        
        printWhitespaces((height * 2 - 3) / 2);
        printStars(3);
        
        printWhitespaces((height * 2 - 3) / 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
