/*
 * @author Ben Kinder
 * @version 1.0
 * 
 * Java Homework PP2.2 - Average calculator of input values.
 */
import java.util.Scanner;

public class AverageCalculator2 {
	public static void main (String[] args) {
		
		int input = 0, numOfIntsEntered = 0;
		float addedInts = 0;
		final float result;
		Scanner scan = new Scanner (System.in);
		
		while (input != 'd') {
			System.out.println("This program will average integers.\nPlease enter integers one per line and then type \"d\" ");
			input = scan.nextInt();
			addedInts += input;
			numOfIntsEntered++;
		}
		
		result = addedInts / numOfIntsEntered;
		System.out.println(result);
		
	}

}