/*
 * @author Ben Kinder
 * @version 1.0
 * 
 * Java Homework PP2.2 - Average calculator of input values.
 */
import java.util.Scanner;

public class AverageCalculator {
	public static void main (String[] args) {
		
		int num1 = 0, num2 = 0, num3 = 0;
		double result = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("This program will average 3 integers.\nPlease enter first integer: ");
		num1 = scan.nextInt();
		System.out.println("Please enter second integer: ");
		num2 = scan.nextInt();
		System.out.println("Please enter third integer: ");
		num3 = scan.nextInt();
		result = ((double) num1 + num2 + num3) / 3;
		System.out.println("The average of " + num1 + ", " + num2 + " and " + num3 + " is " + result + ".");
	}

}
