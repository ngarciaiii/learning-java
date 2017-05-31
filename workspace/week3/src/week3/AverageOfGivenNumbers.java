package week3;

public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int sum = sum(number1, number2, number3, number4);
        double average = 1.0 * sum / 4;
        return average;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
    
//	  MOOC solution:     
//    public static int sum(int number1, int number2, int number3, int number4) {
//        return number1 + number2 + number3 + number4;
//    }
// 
//    public static double average(int number1, int number2, int number3, int number4) {
//        // write your code here
//        int sum = sum(number1, number2, number3, number4);
// 
//        return (double) sum / 4;
//    }
}
