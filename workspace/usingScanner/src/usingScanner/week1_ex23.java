//Missing component Graph.java is in TMC NetBeans' Temperatures
//This code works with Graph.java and worked in NetBeans


package usingScanner;

import java.util.Scanner;

public class week1_ex23 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true) {
            System.out.print("Enter a temperature between -30 and 60: ");
            double value = Double.parseDouble(reader.nextLine());
            
        
            if ((value > -31 && value < 61)) {
                Graph.addNumber(value);
                System.out.print("Add another value? (y/n): ");
                String finish = reader.nextLine();
                if (finish.equals("n")) {
                    System.out.println("The graph session ended.");
                    break;
                }
            } else {
              System.out.println("Value is outside the range");
            }
        }
    }
}