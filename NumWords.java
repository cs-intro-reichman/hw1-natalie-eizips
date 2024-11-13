// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		int full_number = Integer.parseInt(args[0]);

		int hundreds = full_number / 100;
		int tens = (full_number - (hundreds * 100)) / 10;
		int ones = (full_number % 100) % 10;
		
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
